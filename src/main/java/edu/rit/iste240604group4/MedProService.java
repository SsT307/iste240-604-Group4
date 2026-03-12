package edu.rit.iste240604group4;

import edu.rit.iste240604group4.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MedProService {

    // Simulate a DB -- one table per entity
    public List<Patient> patients = new ArrayList<>();
    public List<Doctor> doctors = new ArrayList<>();
    public List<Appointment> appointments = new ArrayList<>();
    public List<MedicalRecord> medicalRecords = new ArrayList<>();
    public List<Hospital> hospitals = new ArrayList<>();
    public List<Insurance> insurances = new ArrayList<>();

    // Add data to the lists
    public MedProService() {

    }

}

