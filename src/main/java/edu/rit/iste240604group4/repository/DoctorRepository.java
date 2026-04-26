package edu.rit.iste240604group4.repository;


// FATMA ALSUWAIDI - 406004792

import edu.rit.iste240604group4.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;


@Repository
//extending JpaRepository, we get built-in methods for freeee
public interface DoctorRepository extends JpaRepository < Doctor, Integer > {

    // --- INHERITED METHODS (provided by JpaRepo)
    List<Doctor> findAll(); //returns all doctors from doc table
    Doctor save(Doctor doctor); //inserts new doctor OR updates existing one
    void deleteById(Integer id); //deletes doctor with given ID
    Optional<Doctor> findById(Integer id); //returns doctor by ID, wrapped in Optional

    // --- FIND BY FIELD + CUSTOM QUERY
    // :speciality is a placeholder
    // LIKE with % allows partial matching
    @Query("SELECT d FROM Doctor d WHERE d.speciality LIKE %:speciality%")
    List<Doctor> findBySpeciality(String speciality);

    // --- UPDATE QUERY
    // sets speciality for doctor with the matching ID
    // :speciality and :id are named parameters matched to the method's parameters
    @Modifying
    @Query("UPDATE Doctor d SET d.speciality = :speciality WHERE d.doctorID = :id")
    void updateSpecialityById(int id, String speciality);
}