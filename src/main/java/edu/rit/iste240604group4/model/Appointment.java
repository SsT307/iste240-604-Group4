package edu.rit.iste240604group4.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    private int appointmentID; // primary key
    // Spring cannot automatically convert the form's text values into LocalDate and LocalTime, so we need to add the @DateTimeFormat annotation
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate Date;
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime Time;
    private String reason;
    private int emiratesID; // foreign key
    private int doctorID; // foreign key
    private int hospitalID; // foreign key


    // EMPTY CONSTRUCTOR - for the POST binding
    public Appointment() {
    }

    // CONSTRUCTOR
    public Appointment(int appointmentID, String reason, LocalDate Date, LocalTime Time, int emiratesID, int doctorID, int hospitalID) {
        this.appointmentID = appointmentID;
        this.reason = reason;
        this.Date = Date;
        this.Time = Time;
        this.emiratesID = emiratesID;
        this.doctorID = doctorID;
        this.hospitalID = hospitalID;
    }

    // Appointment.of
    public static Appointment of(int appointmentID, String reason, LocalDate aDate, LocalTime aTime, int emiratesID, int doctorID, int hospitalID) {
        return new Appointment(appointmentID, reason, aDate, aTime, emiratesID, doctorID, hospitalID);
    }

    // GETTERS
    public int getAppointmentID() {
        return appointmentID;
    }

    public LocalDate getDate() {
        return Date;
    }

    public LocalTime getTime() {
        return Time;
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

    public void setDate(LocalDate aDate) {
        this.Date = aDate;
    }

    public void setTime(LocalTime aTime) {
        this.Time = aTime;
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
