// Tania Aziz - 418005117
package edu.rit.iste240604group4.repository;

import edu.rit.iste240604group4.model.Hospital;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

    // declaring the methods that will be used

    // get all hospitals
    List<Hospital> findAll();

    // save or update a hospital
    Hospital save(Hospital hospital);

    // find a hospital by its ID
    // note: optional handles the case where no hospital is found for the given ID
    Optional<Hospital> findById(Integer id);

    // delete a hospital by its ID
    void deleteById(Integer id);

    // custom JPQL query to find hospitals by name
    @Query("SELECT h FROM Hospital h WHERE h.name LIKE %:name%")
    List<Hospital> findByName(@Param("name") String name);

    // update the owner of a hospital by its ID
    @Modifying
    @Transactional
    @Query("UPDATE Hospital h SET h.owner = :owner WHERE h.hospitalID = :id")
    void updateOwnerById(@Param("id") Integer id, @Param("owner") String owner);

}
