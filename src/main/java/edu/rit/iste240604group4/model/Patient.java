// Shaikha Alhajri 418008663

package edu.rit.iste240604group4.model;

import jakarta.persistence.*;

import java.util.*;


@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer patientId; // PRIMARY KEY

    @Column(name = "emiratesID", nullable = false)
    private Integer emiratesID;

    @Column(name = "firstName", length = 50, nullable = false)
    private String firstName;

    @Column(name = "lastName", length = 50, nullable = false)
    private String lastName;

    @Column(name = "ethnicity", length = 50)
    private String ethnicity;

    // EMPTY CONSTRUCTOR
    public Patient() { }

    // CONSTRUCTOR for creating rows
    public Patient(Integer emiratesID, String firstName, String lastName, String ethnicity) {
        this.emiratesID = emiratesID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ethnicity = ethnicity;
    }

    //GETTERS
    public Integer getPatientId() {
        return patientId;
    }

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

    //SETTERS
    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }
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
