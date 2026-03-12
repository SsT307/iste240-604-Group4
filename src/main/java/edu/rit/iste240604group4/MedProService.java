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

    // Add data to the lists
    public MedProService() {
        this.doctors.add(new Doctor(1 , "Fatma" , "Alsuwaidi" , "Dentistry" , 143));
        this.doctors.add(new Doctor(2 , "Tania" , "Aziz" , "Pediatrics" , 148));
        this.doctors.add(new Doctor(3 , "Shaikha" , "Alhajri" , "Cardiologist" , 123));
        this.doctors.add(new Doctor(4 , "Fatma" , "Almadani" , "Dermatologist" , 145));
    }

    // Query the Database
    // select / get all
    public List<Doctor> findAll(){
        return doctors;
    }
    // insert / add
    public void addDoctor(Doctor doctor){
        this.doctors.add(doctor);
    }

}

