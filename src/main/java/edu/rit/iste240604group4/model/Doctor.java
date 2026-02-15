package edu.rit.iste240604group4.model;

import org.springframework.stereotype.Component;

@Component
public class Doctor {
    private int doctorID; //PRIMARY KEY
    private String firstName;
    private String lastName;
    private String specialty;
    private int hospitalID; //FOREIGN KEY

    // GETTERS
    public int getDoctorID() { return doctorID; }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public String getSpecialty() { return specialty; }

    public int getHospitalID() { return hospitalID; }

    // SETTERS
    public void setDoctorID(int doctorID) { this.doctorID = doctorID; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setSpecialty(String specialty) { this.specialty = specialty; }

    public void setHospitalID(int hospitalID) { this.hospitalID = hospitalID; }


}
