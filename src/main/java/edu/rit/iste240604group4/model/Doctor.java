package edu.rit.iste240604group4.model;
import org.springframework.stereotype.Component;

public class Doctor {
    private int doctorID; //PRIMARY KEY
    private String firstName;
    private String lastName;
    private String speciality;
    private int hospitalID; //FOREIGN KEY

    //default constructor
    public Doctor() {}

    public Doctor(int doctorID, String firstName, String lastName, String speciality, int hospitalID) {
        this.doctorID = doctorID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.hospitalID = hospitalID;

    }

    // GETTERS
    public int getDoctorID() { return doctorID; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSpeciality() { return speciality; }
    public int getHospitalID() { return hospitalID; }

    // SETTERS
    public void setDoctorID(int doctorID) { this.doctorID = doctorID; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setSpeciality(String speciality) { this.speciality = speciality; }
    public void setHospitalID(int hospitalID) { this.hospitalID = hospitalID; }


}