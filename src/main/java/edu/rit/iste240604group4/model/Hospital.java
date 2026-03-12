package edu.rit.iste240604group4.model;


import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private int hospitalID; //Primary Key
    private String name;
    private String owner;
    private List<MedicalRecord> medicalRecords = new ArrayList<>(); //links Hospital and MedicalRecord together

    //empty constructor
    public Hospital(){}

    public Hospital(int hospitalID, String name, String owner) {
        this.hospitalID = hospitalID;
        this.name = name;
        this.owner = owner;
    }

    //Getters
    public int getHospitalID() { return hospitalID; }

    public String getName() { return name; }

    public String getOwner() { return owner; }

    public List<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }

    //Setters
    public void setHospitalID(int hospitalID) { this.hospitalID = hospitalID; }

    public void setName(String name) { this.name = name; }

    public void setOwner(String owner) { this.owner = owner; }

    public void setMedicalRecords(List<MedicalRecord> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }
}
