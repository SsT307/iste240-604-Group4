package edu.rit.iste240604group4.model;
import org.springframework.stereotype.Component;

import java.util.*;

public class Patient {
    private int emiratesID; //PRIMARY KEY
    private String firstName;
    private String lastName;
    private String ethnicity;
    // Link patient -> appointment
    private List<Appointment> appointments = new ArrayList<>();

    // CONSTRUCTOR
    public Patient(int emiratesID, String firstName, String lastName, String ethnicity) {
        this.emiratesID = emiratesID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ethnicity = ethnicity;
    }

    // Patient.of
    public static Patient of(int emiratesID, String firstName, String lastName, String ethnicity) {
        return new Patient(emiratesID, firstName, lastName, ethnicity);
    }

    //GETTERS
    public int getEmiratesID() {return emiratesID;}
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEthnicity() {
        return ethnicity;
    }
    public List<Appointment> getAppointments() { return appointments; }

    //SETTERS
    public void setEmiratesID(int emiratesID) {
        this.emiratesID = emiratesID;
    }
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }
}
