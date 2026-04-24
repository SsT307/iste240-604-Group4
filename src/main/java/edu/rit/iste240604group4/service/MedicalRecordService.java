// Tania Aziz - 418005117
package edu.rit.iste240604group4.service;

import edu.rit.iste240604group4.model.MedicalRecord;
import edu.rit.iste240604group4.repository.MedicalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class MedicalRecordService {

    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    // get all medical records
    public List<MedicalRecord> findAllRecords(){
        return  medicalRecordRepository.findAll();
    }

    // save or update a medical record
    public MedicalRecord saveRecord(MedicalRecord medicalRecord){
        return medicalRecordRepository.save(medicalRecord);
    }

    // find a medical record by its ID
    public Optional<MedicalRecord> findRecordById(Integer id){
        return medicalRecordRepository.findById(id);
    }

    // delete a medical record by its ID
    public void deleteRecord(Integer id){
        medicalRecordRepository.deleteById(id);
    }

    // find records by a visit date
    public List<MedicalRecord> findRecordByDate(LocalDate visitDate){
        return medicalRecordRepository.findByVisitDate(visitDate);
    }

    // update the conditions of a medical record by its ID
    public void updateConditionsById(Integer id, String conditions){
        medicalRecordRepository.updateConditionsById(id, conditions);
    }


}
