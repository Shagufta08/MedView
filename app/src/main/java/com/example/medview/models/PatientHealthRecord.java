package com.example.medview.models;

public class PatientHealthRecord {
    String reportName, date, hospitalName, doctorName, disease,prescriptionDetail;

    public PatientHealthRecord(String reportName, String date, String hospitalName, String doctorName, String disease, String prescriptionDetail) {
        this.reportName = reportName;
        this.date = date;
        this.hospitalName = hospitalName;
        this.doctorName = doctorName;
        this.disease = disease;
        this.prescriptionDetail = prescriptionDetail;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getPrescriptionDetail() {
        return prescriptionDetail;
    }

    public void setPrescriptionDetail(String prescriptionDetail) {
        this.prescriptionDetail = prescriptionDetail;
    }
}
