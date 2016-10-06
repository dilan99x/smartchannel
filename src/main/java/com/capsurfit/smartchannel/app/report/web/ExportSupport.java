package com.capsurfit.smartchannel.app.report.web;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class ExportSupport extends ActionSupport implements ServletResponseAware, ServletRequestAware {

    private HttpServletResponse httpServletResponse;
    private HttpServletRequest httpServletRequest;
    private String contentType = "APPLICATION/OCTET-STREAM";


    @Override
    public void setServletResponse(HttpServletResponse httpServletResponse) {
        this.httpServletResponse = httpServletResponse;
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.httpServletRequest = httpServletRequest;
    }

    public void processReport(ReportTypeEnum reportTypeEnum, List<?> beansList, String reportName, Map<String, Object> parameters) throws Exception {
        switch (reportTypeEnum) {
            case PDF:
                processReportAsPDF(beansList, reportName, parameters);
                break;
            case CSV:
                processReportAsCsv(beansList, reportName);
                break;
            case HTML:
                processReportAsHtml(beansList, reportName);
                break;
            case TEXT:
                processReportAsText(beansList, reportName);
                break;
            default:
                throw new RuntimeException("Un supported report type");
        }
    }

    private void processReportAsText(List<?> beansList, String reportName) {

    }

    private void processReportAsHtml(List<?> beansList, String reportName) {

    }

    private void processReportAsCsv(List<?> beansList, String reportName) {

    }

    private void processReportAsPDF(List<?> beansList, String reportName, Map<String, Object> parameters) throws Exception {
        System.out.println(">>>>>>>Start processing of pdf report!");

        JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(beansList);
        JasperDesign jasperDesign = JRXmlLoader.load(getJasperFilePath(reportName));
        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, beanColDataSource);
        setResponseHeaderData(reportName, ReportTypeEnum.PDF);
        ServletOutputStream sos = httpServletResponse.getOutputStream();
        JasperExportManager.exportReportToPdfStream(jasperPrint, sos);
        sos.flush();
        sos.close();
        httpServletResponse.getOutputStream().flush();
        httpServletResponse.getOutputStream().close();

        System.out.println(">>>>>>>End processing of pdf report!");
        return;

    }

    private InputStream getJasperFilePath(String reportName) throws FileNotFoundException {
        System.out.println(">>>>>>> Path : " + httpServletRequest.getSession().getServletContext().getRealPath("/reports/" + reportName + ".jrxml"));
        return new FileInputStream(httpServletRequest.getSession().getServletContext().getRealPath("/reports/" + reportName + ".jrxml"));
    }

    private void setResponseHeaderData(String reportName, ReportTypeEnum reportTypeEnum) {
        httpServletResponse.setContentType(contentType);
        StringBuilder headerBuilder = new StringBuilder();
        headerBuilder.append("Attachment;Filename=").append("\"").append(reportName).append(".").
                append(reportTypeEnum.getReportType()).append("\"");

        httpServletResponse.setHeader("Content-Disposition", headerBuilder.toString());
        System.out.println(">>>>>>>End of setting response headers for report download");
        //System.out.println(">>>>>>header info : " + httpServletResponse.getHeader("Content-Disposition"));
    }
}
