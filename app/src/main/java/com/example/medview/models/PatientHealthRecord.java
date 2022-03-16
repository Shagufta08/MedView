package com.example.medview.models;

public class PatientHealthRecord {
    String reportName, prescriptionDetail;

    public PatientHealthRecord(String reportName, String prescriptionDetail) {
        this.reportName = reportName;
        this.prescriptionDetail = prescriptionDetail;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getPrescriptionDetail() {
        return prescriptionDetail;
    }

    public void setPrescriptionDetail(String prescriptionDetail) {
        this.prescriptionDetail = prescriptionDetail;
    }
}
