// Shaikha Alhajri 418008663
package edu.rit.iste240604group4.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appointmentID; // primary key
    // Spring cannot automatically convert the form's text values into LocalDate and LocalTime, so we need to add the @DateTimeFormat annotation
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate date;
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime time;
    private String reason;
    private int patientID; // foreign key
    private int doctorID; // foreign key
    private int hospitalID; // foreign key



    // EMPTY CONSTRUCTOR - for POST binding
    public Appointment() {}

    // CONSTRUCTOR for creating rows
    public Appointment(String reason, LocalDate date, LocalTime time, int emiratesID, int doctorID, int hospitalID) {
        this.reason = reason;
        this.date = date;
        this.time = time;
        this.patientID = patientID;
        this.doctorID = doctorID;
        this.hospitalID = hospitalID;
    }

    // GETTERS
    public int getAppointmentID() {
        return appointmentID;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getReason() {
        return reason;
    }

    public int getPatientID() { return patientID; }

    public int getDoctorID() {
        return doctorID;
    }

    public int getHospitalID() { return hospitalID; }

    // SETTERS
    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public void setHospitalID(int hospitalID) { this.hospitalID = hospitalID; }
}
