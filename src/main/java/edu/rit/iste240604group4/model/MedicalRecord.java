// Tania Aziz - 418005117
package edu.rit.iste240604group4.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "medical_record")
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recordID; // primary key
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate visitDate;
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime visitTime;
    private String conditions;
    private String treatmentGiven;
    private Boolean effective;
    private int patientID; // foreign key
    private int hospitalID; // foreign key

    // Default Constructor
    public MedicalRecord() {}

    public MedicalRecord(LocalDate visitDate, LocalTime visitTime,
                         String conditions, String treatmentGiven, Boolean effective, int patientID, int hospitalID) {
        this.visitDate = visitDate;
        this.visitTime = visitTime;
        this.conditions = conditions;
        this.treatmentGiven = treatmentGiven;
        this.effective = effective;
        this.patientID = patientID;
        this.hospitalID = hospitalID;
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

    public int getPatientID() {
        return patientID;
    }

    public int getHospitalID() {
        return hospitalID;
    }

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

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public void setHospitalID(int hospitalID) {
        this.hospitalID = hospitalID;
    }
}
