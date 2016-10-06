package com.capsurfit.smartchannel.app.report.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestUserAction  extends ExportSupport {

    public String exportReportAsPdf() {
        Map<String, Object> param = new HashMap<>();
        try {
            DataBeanMaker dataBeanMaker = new DataBeanMaker();
            ArrayList<Test> dataBeanList = dataBeanMaker.getTestDataBeanList();
            processReport(ReportTypeEnum.PDF, dataBeanList, "test", param);

        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return SUCCESS;
    }
}
