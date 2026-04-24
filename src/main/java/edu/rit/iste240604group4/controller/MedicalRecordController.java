// Tania Aziz - 418005117   
package edu.rit.iste240604group4.controller;

import edu.rit.iste240604group4.model.MedicalRecord;
import edu.rit.iste240604group4.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/records")
public class MedicalRecordController {

    @Autowired
    private MedicalRecordService medicalRecordService;

    // get all medical records list
    @GetMapping
    public List<MedicalRecord> getMedicalRecords() {
        return medicalRecordService.findAllRecords();
    }

    // get medical record by id
    @GetMapping("/{id}")
    public Optional<MedicalRecord> getMedicalRecordById(@PathVariable int id) {
        return medicalRecordService.findRecordById(id);
    }

    // search medical record using visit date
    @GetMapping("/search")
    public List<MedicalRecord> getRecordsByDate(@RequestParam LocalDate visitDate){
        return medicalRecordService.findRecordByDate(visitDate);
    }

    // post a new record
    @PostMapping
    public MedicalRecord createMedicalRecord(@RequestBody MedicalRecord medicalRecord){
        return medicalRecordService.saveRecord(medicalRecord);
    }

    // update a whole record using its id
    @PutMapping("/{id}")
    public MedicalRecord updateMedicalRecord(@PathVariable Integer id, @RequestBody MedicalRecord medicalRecord) {
        medicalRecord.setRecordID(id);
        return medicalRecordService.saveRecord(medicalRecord);
    }

    // update ONLY conditions in a record using its id
    @PutMapping("/{id}/conditions")
    public void updateConditions(@PathVariable Integer id, @RequestParam String conditions) {
        medicalRecordService.updateConditionsById(id, conditions);
    }

    // delete a record using its id
    @DeleteMapping("/{id}")
    public String deleteMedicalRecord(@PathVariable Integer id) {
        medicalRecordService.deleteRecord(id);
        return "Record Deleted Successfully!";
    }




}
