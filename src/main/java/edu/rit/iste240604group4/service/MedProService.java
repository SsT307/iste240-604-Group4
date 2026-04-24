package edu.rit.iste240604group4.service;

import edu.rit.iste240604group4.model.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class MedProService {

    // Simulate a DB -- one table per entity
    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();
    private List<MedicalRecord> medicalRecords = new ArrayList<>();
    private List<Hospital> hospitals = new ArrayList<>();
    private List<Insurance> insurances = new ArrayList<>();

    // Add data to the lists
    public MedProService() {
        // --- APPOINTMENT AND PATIENT
            // -- Patients
        Patient p1 = Patient.of(1234567890, "Ahmed", "Mohammad", "Egyptian");
        Patient p2 = Patient.of(1234567891, "Hamda", "Alsuwaidi", "Emirati");
        Patient p3 = Patient.of(1234567892, "Omar", "Khalil", "Lebanese");
        Patient p4 = Patient.of(1234567893, "Priya", "Khan", "Pakistani");
            // -- Appointments
        Appointment a1 = Appointment.of(1, "Annual checkup", LocalDate.of(2026,3,13), LocalTime.of(9,0), 1234567890, 3, 1);
        Appointment a2 = Appointment.of(2, "Follow-up visit", LocalDate.of(2026,3,14), LocalTime.of(11,30), 1234567891, 2, 3);
        Appointment a3 = Appointment.of(3, "Blood test", LocalDate.of(2026,3,16), LocalTime.of(14,0), 1234567892, 1, 2);
        Appointment a4 = Appointment.of(4, "Skin consultation", LocalDate.of(2026,3,20), LocalTime.of(8,30), 1234567893, 4, 4);

            // -- Link appointments -> patients
        p1.getAppointments().add(a1);
        p2.getAppointments().add(a2);
        p3.getAppointments().add(a3);
        p4.getAppointments().add(a4);

            // -- Add to the simulated DB
        patients.addAll(List.of(p1, p2, p3, p4));
        appointments.addAll(List.of(a1, a2, a3, a4));

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
        MedicalRecord mr1 = new MedicalRecord(1, LocalDate.of(2024, 1, 15), LocalTime.of(9, 0), "Flu",
                "Rest and fluids", true, 1234567890, 1);
        MedicalRecord mr2 = new MedicalRecord(2, LocalDate.of(2025, 2, 6), LocalTime.of(8, 0), "Diabetes",
                "Insulin shots", true, 1234567891, 2);
        MedicalRecord mr3 = new MedicalRecord(3, LocalDate.of(2025, 3, 12), LocalTime.of(11, 30), "Hypertension",
                "Blood pressure medication", true, 1234567892, 3);
        MedicalRecord mr4 = new MedicalRecord(4, LocalDate.of(2025, 7, 8), LocalTime.of(10, 15), "Asthma",
                "Inhaler and steroids", true, 1234567893, 4);

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
        // APPOINTMENT + PATIENT
    // Get & Add patient
    public List<Patient> viewAllPatient() { return patients; }
    public void addPatient(Patient p) { patients.add(p); }

    // Get & Add appointment
    public List<Appointment> viewAllAppointment() { return appointments; }
    public void addApp(Appointment a) { appointments.add(a); }

        // DOCTOR
    // Get all doctors
    public List<Doctor> findAll(){
        return doctors;
    }
    // Add a new doctor
    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }

        // HOSPITAL + MEDICAL RECORD
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

        // INSURANCE
    // Get list of insurance
    public List<Insurance> findAllInsurance() {
        return insurances;
    }
    // Adding new insurance
    public void addInsurance(Insurance i) {
        this.insurances.add(i);
}
}








