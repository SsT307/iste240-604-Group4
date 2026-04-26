// Fatma Almadani - 421009269

package edu.rit.iste240604group4.controller;
import edu.rit.iste240604group4.model.Insurance;
import edu.rit.iste240604group4.service.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/insurance") // base url for all endpoints
public class InsuranceController {

    @Autowired
    private InsuranceService insuranceService; // connect to service layer

    // get all insurance records
    @GetMapping
    public List<Insurance> getAllInsurance() {
        return insuranceService.getAllInsurance();
    }

    // get one insurance by ID
    @GetMapping("/{id}")
    public Optional<Insurance> getInsuranceById(@PathVariable Integer id) {
        return insuranceService.getInsuranceById(id);
    }

    // search insurance by name (LIKE)
    @GetMapping("/search")
    public List<Insurance> searchInsuranceByName(@RequestParam String insuranceName) {
        return insuranceService.searchInsuranceByName(insuranceName);
    }

    // add new insurance
    @PostMapping
    public Insurance addInsurance(@RequestBody Insurance insurance) {
        return insuranceService.addInsurance(insurance);
    }

    // update insurance name using ID
    @PutMapping("/{id}")
    public void updateInsurance(@PathVariable Integer id, @RequestBody Insurance insurance) {
        insuranceService.updateInsuranceName(id, insurance.getInsuranceName());
    }

    // delete insurance by ID
    @DeleteMapping("/{id}")
    public void deleteInsuranceById(@PathVariable Integer id) {
        insuranceService.deleteInsuranceById(id);
    }
}