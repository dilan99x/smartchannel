package com.capsurfit.smartchannel.app.report.web;

public enum ReportTypeEnum {
    PDF("pdf"),
    CSV("csv"),
    HTML("html"),
    TEXT("text");

    private String reportType;

    ReportTypeEnum(String reportType) {
        this.reportType = reportType;
    }

    public String getReportType() {
        return reportType;
    }
}
