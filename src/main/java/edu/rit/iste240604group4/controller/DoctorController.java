package edu.rit.iste240604group4.controller;

// FATMA ALSUWAIDI - 406004792

import edu.rit.iste240604group4.model.Doctor;
import edu.rit.iste240604group4.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController

// sets base URL for ALL endpoints in this class
@RequestMapping("/api/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    // GET /api/doctors
    // Returns a list of ALL doctors from the db as JSON
    @GetMapping
    public List<Doctor> getAllDoctors() {
        return doctorService.findAll();
    }

    // GET /api/doctors/{id}
    // ex. /api/doctors/3 gets doctor w ID 3
    @GetMapping("/{id}")
    public Optional<Doctor> getDoctorById(@PathVariable int id) {
        return doctorService.findById(id);
    }

    // GET /api/doctors/search?speciality=xxx
    // ex. /api/doctors/search?speciality=Dentistry, returns a list of doctors w that speciality
    @GetMapping("/search")
    public List<Doctor> searchDoctors(@RequestParam String speciality) {
        return doctorService.findBySpeciality(speciality);
    }

    // POST /api/doctors
    // creates a new doctor record in the db
    @PostMapping
    public void addDoctor(@RequestBody Doctor doctor) {
        doctorService.addDoctor(doctor);
    }

    // PUT /api/doctors/{id}?speciality=xxz -- updates the speciality of the doctor w given ID
    // PUT update speciality by ID
    @PutMapping("/{id}")
    public Doctor updateDoctor(@PathVariable int id, @RequestBody Doctor doctor) {
        doctor.setDoctorID(id); // set the ID so Spring knows which record to update
        return doctorService.addDoctor(doctor); // use save() via service
    }

    // DELETE /api/doctors/{id}
    // deletes doctor w the given ID from the db
    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable int id) {
        doctorService.deleteById(id);
    }

}