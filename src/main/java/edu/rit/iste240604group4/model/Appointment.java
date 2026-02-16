package edu.rit.iste240604group4.model;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class Appointment {
    private int appointmentID; // primary key
    private LocalDate aDate;
    private LocalTime aTime;
    private String reason;
    private int emiratesID; // foreign key
    private int doctorID; // foreign key
    private int hospitalID; // foreign key

    // getters
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

    // setters
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
