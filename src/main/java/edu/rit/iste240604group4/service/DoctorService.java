package edu.rit.iste240604group4.service;

// FATMA ALSUWAIDI - 406004792

import edu.rit.iste240604group4.model.Doctor;
import edu.rit.iste240604group4.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    // no need to write "new DoctorRepository()" -- spring handles it
    @Autowired
    private DoctorRepository doctorRepository;

    // gets all doctors from the database -- inherited findAll() from repo
    public List<Doctor> findAll() {
        return doctorRepository.findAll();
    }

    // gets one doctor by their ID
    // findById() returns an Optional<Doctor> (might exist, might not)
    public Optional<Doctor> findById(int doctorID) {
        return doctorRepository.findById(doctorID);
    }

    // gets a list of doctors matching the speciality
    // calls custom findBySpeciality() method from repo
    public List<Doctor> findBySpeciality(String speciality) {
        return doctorRepository.findBySpeciality(speciality);
    }

    // adds new doctor to the db -- inherited save(), inserts if new, update if exists
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor); // change void to return Doctor
    }

    // updates speciality of a doctor with the given ID
    // calls custom @Modifying + @Query method from the repo
    public void updateSpecialityById(int doctorID, String speciality) {
        doctorRepository.updateSpecialityById(doctorID, speciality);
    }

    // deletes the doctor with the given ID from db -- inherited deletedById() from repo
    public void deleteById(int doctorID) {
        doctorRepository.deleteById(doctorID);
    }
}