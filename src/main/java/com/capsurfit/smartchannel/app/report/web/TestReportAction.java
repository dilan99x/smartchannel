package com.capsurfit.smartchannel.app.report.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestReportAction extends ExportSupport {

    public String exportReportAsPdf() {
        Map<String, Object> param = new HashMap<>();
        try {
            DataBeanMaker dataBeanMaker = new DataBeanMaker();
            ArrayList<DataBean> dataBeanList = dataBeanMaker.getDataBeanList();
            processReport(ReportTypeEnum.PDF, dataBeanList, "test_jasper", param);

        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return SUCCESS;
    }
}
