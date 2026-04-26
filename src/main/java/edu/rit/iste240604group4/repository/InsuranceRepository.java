// Fatma Almadani - 421009269

package edu.rit.iste240604group4.repository;
import edu.rit.iste240604group4.model.Insurance;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Integer> {

    // get all insurance records
    List<Insurance> findAll();

    // get one insurance by ID
    Optional<Insurance> findById(Integer id);

    // save/add insurance
    Insurance save(Insurance insurance);

    // search insurance by partial name (LIKE)
    @Query("SELECT i FROM Insurance i WHERE i.insuranceName LIKE %:name%")
    List<Insurance> findByInsuranceName(@Param("name") String insuranceName);

    // update insurance name using ID
    @Modifying
    @Transactional
    @Query("UPDATE Insurance i SET i.insuranceName = :name WHERE i.insuranceID = :id")
    void updateInsuranceNameById(@Param("id") Integer insuranceID,
                                 @Param("name") String insuranceName);

    // delete insurance by ID
    void deleteById(Integer id);
}
