// Fatma Almadani - 421009269

package edu.rit.iste240604group4.service;
import edu.rit.iste240604group4.model.Insurance;
import edu.rit.iste240604group4.repository.InsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InsuranceService {

    @Autowired
    private InsuranceRepository insuranceRepository; // connect to repository

    // get all insurance records
    public List<Insurance> getAllInsurance() {
        return insuranceRepository.findAll();
    }

    // get one insurance by ID
    public Optional<Insurance> getInsuranceById(Integer id) {
        return insuranceRepository.findById(id);
    }

    // search insurance by name (LIKE)
    public List<Insurance> searchInsuranceByName(String insuranceName) {
        return insuranceRepository.findByInsuranceName(insuranceName);
    }

    // add new insurance
    public Insurance addInsurance(Insurance insurance) {
        return insuranceRepository.save(insurance);
    }

    // update insurance name using ID
    public void updateInsuranceName(Integer id, String name) {
        insuranceRepository.updateInsuranceNameById(id, name);
    }

    // delete insurance by ID
    public void deleteInsuranceById(Integer id) {
        insuranceRepository.deleteById(id);
    }
}
