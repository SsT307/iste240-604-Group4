// Tania Aziz - 418005117
package edu.rit.iste240604group4.service;

import edu.rit.iste240604group4.model.Hospital;
import edu.rit.iste240604group4.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    // find all hospitals
    public List<Hospital> findAllHospitals(){
        return hospitalRepository.findAll();
    }

    // save/update a hospital
    public Hospital saveHospital(Hospital hospital){
        return hospitalRepository.save(hospital);
    }

    // find hospital by ID
    public Optional<Hospital> findHospitalById(Integer id){
        return hospitalRepository.findById(id);
    }

    // delete a hospital by ID
    public void deleteHospital(Integer id){
        hospitalRepository.deleteById(id);
    }

    // find hospitals by name
    public List<Hospital> findHospitalByName(String name){
        return hospitalRepository.findByName(name);
    }

    // update owner of hospital by ID
    public void updateHosptialOwner(Integer id, String owner){
        hospitalRepository.updateOwnerById(id, owner);
    }


}
