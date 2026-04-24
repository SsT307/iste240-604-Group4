// Tania Aziz - 418005117
package edu.rit.iste240604group4.repository;

import edu.rit.iste240604group4.model.MedicalRecord;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Integer> {

    // Declaring the methods that will be used

    // Get all medical records
    List<MedicalRecord> findAll();

    // Save or update a medical record
    MedicalRecord save(MedicalRecord medicalRecord);

    // Find a medical record by its ID
    // note: optional handles the case where no hospital is found for the given ID
    Optional<MedicalRecord> findById(Integer id);

    // Delete a medical record by its ID
    void deleteById(Integer id);

    // Custom JPQL query to find medical records by visit date
    @Query("SELECT m FROM MedicalRecord m WHERE m.visitDate = :visitDate")
    List<MedicalRecord> findByVisitDate(@Param("visitDate") LocalDate visitDate);

    // Update the conditions of a medical record by its ID
    @Modifying
    @Transactional
    @Query("UPDATE MedicalRecord m SET m.conditions = :conditions WHERE m.recordID = :id")
    void updateConditionsById(@Param("id") Integer id, @Param("conditions") String conditions);

}
