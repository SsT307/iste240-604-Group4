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
        // --- APPOINTMENT AND PERSON


        // --- DOCTOR
        this.doctors.add(new Doctor(1 , "Fatma" , "Alsuwaidi" , "Dentistry" , 143));
        this.doctors.add(new Doctor(2 , "Tania" , "Aziz" , "Pediatrics" , 148));
        this.doctors.add(new Doctor(3 , "Shaikha" , "Alhajri" , "Cardiologist" , 123));
        this.doctors.add(new Doctor(4 , "Fatma" , "Almadani" , "Dermatologist" , 142));


        // --- HOSPITAL AND MEDICAL RECORDS
            // Hospitals
        Hospital hospital1 = new Hospital(1, "City Medical Center", "Government");
        Hospital hospital2 = new Hospital(2, "Aster Hospital", "Private");
        Hospital hospital3 = new Hospital(3, "Rashid Hospital", "Government");
        Hospital hospital4 = new Hospital(4, "New Medical Hospital", "Private");
            // Medical Records
        MedicalRecord mr1 = new MedicalRecord(1, "2024-01-15", "09:00", "Flu",
                "Rest and fluids", true, 1234567890);
        MedicalRecord mr2 = new MedicalRecord(2, "2025-02-06", "08:00", "Diabetes",
                "Insulin shots", true, 1234567891);
        MedicalRecord mr3 = new MedicalRecord(3, "2025-03-12", "11:30", "Hypertension",
                "Blood pressure medication", true, 1234567892);
        MedicalRecord mr4 = new MedicalRecord(4, "2025-07-08", "10:15", "Asthma",
                "Inhaler and steroids", true, 1234567893);

            // Linking hospitals to medical records
        hospital1.getMedicalRecords().addAll(List.of(mr1, mr2, mr3, mr4));
        hospital2.getMedicalRecords().addAll(List.of(mr1, mr2, mr3, mr4));
        hospital3.getMedicalRecords().addAll(List.of(mr1, mr2, mr3, mr4));
        hospital4.getMedicalRecords().addAll(List.of(mr1, mr2, mr3, mr4));

            // Adding all hospitals to the hospital list
        hospitals.addAll(List.of(hospital1, hospital2, hospital3, hospital4));
            // Storing all the records in medical record list to access this master list later
        medicalRecords.addAll(List.of(mr1, mr2, mr3, mr4));

        // --- INSURANCE
        Insurance i1 = new Insurance();
        i1.setInsuranceID(1);
        i1.setInsuranceName("Daman");

        Insurance i2 = new Insurance();
        i2.setInsuranceID(2);
        i2.setInsuranceName("Thiqa");

        Insurance i3 = new Insurance();
        i3.setInsuranceID(3);
        i3.setInsuranceName("NextCare");

        Insurance i4 = new Insurance();
        i4.setInsuranceID(4);
        i4.setInsuranceName("Almadallah");

        insurances.add(i1);
        insurances.add(i2);
        insurances.add(i3);
        insurances.add(i4);
    }





    // Query the Database

    // Get all doctors
    public List<Doctor> findAll(){
        return doctors;
    }
    // Add a new doctor
    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }

    // Method for listing all hospitals
    public List<Hospital> viewHospitals(){
        return hospitals;
    }

    // Method for adding a new hospital
    public void addHospital(Hospital h){
        //making sure every new hospital added has all the medical records added to it as well!
        h.getMedicalRecords().addAll(medicalRecords);
        hospitals.add(h);
    }

    // Get list of insurance
    public List<Insurance> findAllInsurance() {
        return insurances;
    }
    // Adding new insurance
    public void addInsurance(Insurance i) {
        this.insurances.add(i);
}
}








