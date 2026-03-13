package edu.rit.iste240604group4.model;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    private int appointmentID; // primary key
    private LocalDate aDate;
    private LocalTime aTime;
    private String reason;
    private int emiratesID; // foreign key
    private int doctorID; // foreign key
    private int hospitalID; // foreign key


    // EMPTY CONSTRUCTOR - for the POST binding
    public Appointment() {
    }

    // CONSTRUCTOR
    public Appointment(int appointmentID, String reason, int emiratesID, int doctorID, int hospitalID) {
        this.appointmentID = appointmentID;
        this.reason = reason;
        this.emiratesID = emiratesID;
        this.doctorID = doctorID;
        this.hospitalID = hospitalID;
    }

    // Appointment.of
    public static Appointment of(int appointmentID, String reason, int emiratesID, int doctorID, int hospitalID) {
        return new Appointment(appointmentID, reason, emiratesID, doctorID, hospitalID);
    }

    // GETTERS
    public int getAppointmentID() {
        return appointmentID;
    }

    public LocalDate getaDate() {
        return aDate;
    }

    public LocalTime getaTime() {
        return aTime;
    }

    public String getReason() {
        return reason;
    }

    public int getEmiratesID() {
        return emiratesID;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public int getHospitalID() {
        return hospitalID;
    }

    // SETTERS
    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public void setaDate(LocalDate aDate) {
        this.aDate = aDate;
    }

    public void setaTime(LocalTime aTime) {
        this.aTime = aTime;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setEmiratesID(int emiratesID) {
        this.emiratesID = emiratesID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public void setHospitalID(int hospitalID) {
        this.hospitalID = hospitalID;
    }
}
