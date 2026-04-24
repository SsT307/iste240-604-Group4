// Tania Aziz - 418005117
package edu.rit.iste240604group4.controller;

import edu.rit.iste240604group4.model.Hospital;
import edu.rit.iste240604group4.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/hospitals")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    // view list of all hospitals
    @GetMapping
    public List<Hospital> getAllHospitals() {
        return hospitalService.findAllHospitals();
    }

    // GET one hospital by ID
    @GetMapping("/{id}")
    public Optional<Hospital> getHospitalById(@PathVariable Integer id) {
        return hospitalService.findHospitalById(id);
    }

    // GET hospitals by their name
    @GetMapping("/search")
    public List<Hospital> searchHospitals(@RequestParam String name) {
        return hospitalService.findHospitalByName(name);
    }

    // add a new hospital using request body
    @PostMapping
    public Hospital addHospital(@RequestBody Hospital hospital) {
        return hospitalService.saveHospital(hospital);
    }

    // update an existing hospital
    @PutMapping("/{id}")
    public Hospital updateHospital(@PathVariable Integer id, @RequestBody Hospital hospital) {
        //sets ID of hospital to given ID so that spring knows which record to update/not create new one
        hospital.setHospitalID(id);
        return hospitalService.saveHospital(hospital);
    }

    // delete a hospital from the list
    @DeleteMapping("/{id}")
    public String deleteHospital(@PathVariable Integer id) {
        hospitalService.deleteHospital(id);
        return "Hospital Deleted Successfully!";
    }





}
