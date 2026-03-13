package edu.rit.iste240604group4.model;

import org.springframework.cglib.core.Local;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

public class MedicalRecord {
    private int recordID; // primary key
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate visitDate;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalTime visitTime;
    private String conditions;
    private String treatmentGiven;
    private Boolean effective;
    private int emiratesID; // foreign key
    // not using because the link with hospital is created via Hospital's list
    // private int hospitalID; // foreign key
        // I think we should keep it, for future use when connecting our database which already has that FK -Shaikha

    public MedicalRecord() {}

    public MedicalRecord(int recordID,  LocalDate visitDate, LocalTime visitTime,
                         String conditions, String treatmentGiven, Boolean effective, int emiratesID) {
        this.recordID = recordID;
        this.visitDate = visitDate;
        this.visitTime = visitTime;
        this.conditions = conditions;
        this.treatmentGiven = treatmentGiven;
        this.effective = effective;
        this.emiratesID = emiratesID;
    }

    // getters
    public int getRecordID() {
        return recordID;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public LocalTime getVisitTime() {
        return visitTime;
    }

    public String getConditions() {
        return conditions;
    }

    public String getTreatmentGiven() {
        return treatmentGiven;
    }

    public Boolean getEffective() {
        return effective;
    }

    public int getEmiratesID() {
        return emiratesID;
    }

//    public int getHospitalID() {
//        return hospitalID;
//    }

    // setters

    public void setRecordID(int recordID) {
        this.recordID = recordID;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    public void setVisitTime(LocalTime visitTime) {
        this.visitTime = visitTime;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public void setTreatmentGiven(String treatmentGiven) {
        this.treatmentGiven = treatmentGiven;
    }

    public void setEffective(Boolean effective) {
        this.effective = effective;
    }

    public void setEmiratesID(int emiratesID) {
        this.emiratesID = emiratesID;
    }

//    public void setHospitalID(int hospitalID) {
//        this.hospitalID = hospitalID;
//    }
}
