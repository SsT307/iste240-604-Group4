package edu.rit.iste240604group4.model;


// FATMA ALSUWAIDI - 406004792

import jakarta.persistence.*;

//class is a db entity -- it will be mapped to a table in mysql
@Entity

// @Table specifies exact name of table in db that this class maps to
@Table(name = "doctor")
public class Doctor {

    // @Id marks the field as PK of the table
    // @GeneratedValue with IDENTITY strategy means MySQL will auto-increment this value
    // -- so we don't need to manually set the ID when inserting a new doctor
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctorID; // PRIMARY KEY

    // @Column maps this field to a column in the doctor table
    // name = the exact column name
    // length = max characters allowed
    // nullable = false means this field is REQUIRED -- cannot be empty
    @Column(name = "firstName", length = 50, nullable = false)
    private String firstName;

    @Column(name = "lastName", length = 50, nullable = false)
    private String lastName;

    // nullable is not set -- defaults to true, meaning speciality is optional
    @Column(name = "speciality", length = 100)
    private String speciality;

    // hospitalID is FK referencing the hospital table
    @Column(name = "hospitalID")
    private int hospitalID; // FOREIGN KEY

    // default constructor
    public Doctor() { }

    // constructor -- used when we want to create a Doctor with all fields at once
    // ex. when seeding the db w initial data
    public Doctor(String firstName, String lastName, String speciality, int hospitalID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.hospitalID = hospitalID;
    }

    // GETTERS
    public int getDoctorID() {
        return doctorID;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSpeciality() {
        return speciality;
    }
    public int getHospitalID() {
        return hospitalID;
    }

    // SETTERS
    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public void setHospitalID(int hospitalID) {
        this.hospitalID = hospitalID;
    }
}