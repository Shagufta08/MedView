package com.example.medview.models;

public class DoctorUser {
    String id , licenseId , currentHospital , specialisation , doctorPassword;

    public DoctorUser(String id, String licenseId, String currentHospital, String specialisation, String doctorPassword) {
        this.id = id;
        this.licenseId = licenseId;
        this.currentHospital = currentHospital;
        this.specialisation = specialisation;
        this.doctorPassword = doctorPassword;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public String getCurrentHospital() {
        return currentHospital;
    }

    public void setCurrentHospital(String currentHospital) {
        this.currentHospital = currentHospital;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String getDoctorPassword() {
        return doctorPassword;
    }

    public void setDoctorPassword(String doctorPassword) {
        this.doctorPassword = doctorPassword;
    }
}
