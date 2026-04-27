// Shaikha Alhajri 418008663

package edu.rit.iste240604group4.repository;


import edu.rit.iste240604group4.model.Patient;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

    // -- Inherited methods for patients

    // Get all patient
    List<Patient> findAll();

    // Save/Update patients
    Patient save(Patient patient);

    // Find an appointment by EmiratesID
    Optional<Patient> findById(Integer id);

    // Delete appointment by id
    void deleteById(Integer id);

    // JPQL query
    // search patients by last name
    @Query("SELECT p FROM Patient p WHERE p.lastName LIKE %:lastName%")
    List<Patient> findByLastName(@Param("lastName") String lastName);

    // Update values
    // update only ethnicity by id
    @Modifying
    @Transactional
    @Query("UPDATE Patient p SET p.ethnicity = :ethnicity WHERE p.patientId = :id")
    void updateEthnicityById(@Param("id") Integer id, @Param("ethnicity") String ethnicity);

}
