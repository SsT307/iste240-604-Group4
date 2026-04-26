// Shaikha Alhajri 418008663

package edu.rit.iste240604group4.controller;

import edu.rit.iste240604group4.model.Patient;
import edu.rit.iste240604group4.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
    @Autowired
    private PatientService patientService;

    // get all patients
    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.findAllPatients();
    }

    // get one patient by id
    @GetMapping("/{id}")
    public Optional<Patient> getPatientById(@PathVariable Integer id) {
        return patientService.findById(id);
    }

    // search patient by last name
    @GetMapping("/search")
    public List<Patient> searchPatients(@RequestParam String lastName) {
        return patientService.findPatientByLastName(lastName);
    }

    // create patient
    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }

    // update whole patient row
    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Integer id, @RequestBody Patient patient) {
        patient.setEmiratesID(id);
        return patientService.savePatient(patient);
    }

    // update only ethnicity by id
    @PutMapping("/{id}/ethnicity")
    public void updateEthnicity(@PathVariable Integer id, @RequestParam String ethnicity) {
        patientService.updateEthnicityById(id, ethnicity);
    }

    // delete patient by id
    @DeleteMapping("/{id}")
    public String deletePatient(@PathVariable Integer id) {
        patientService.deletePatient(id);
        return "Patient Deleted Successfully!";
    }
}
