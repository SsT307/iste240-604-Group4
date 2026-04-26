// Shaikha Alhajri 418008663

package edu.rit.iste240604group4.service;

import edu.rit.iste240604group4.model.Patient;
import edu.rit.iste240604group4.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    // find all
    public List<Patient> findAllPatients(){
        return patientRepository.findAll();
    }

    // save/update
    public Patient savePatient(Patient patient){
        return patientRepository.save(patient);
    }

    // find
    public Optional<Patient> findById(Integer id){
        return patientRepository.findById(id);
    }

    // delete
    public void deletePatient(Integer id){
        patientRepository.deleteById(id);
    }

    // search patient by last name
    public List<Patient> findPatientByLastName(String lastName) {
        return patientRepository.findByLastName(lastName);
    }

    // update patient ethnicity by id
    public void updateEthnicityById(Integer id, String ethnicity) {
        patientRepository.updateEthnicityById(id, ethnicity);
    }
}
