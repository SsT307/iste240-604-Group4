package edu.rit.iste240604group4.repository;


import edu.rit.iste240604group4.model.Appointment;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

    // -- Inherited methods for appointment

    // Get all appointments
    List<Appointment> findAll();

    // Save/Update appointment records
    Appointment save(Appointment appointment);

    // Find an appointment by EmiratesID
    Optional<Appointment> findByAppointmentID(Integer appointmentid);

    // Delete appointment by id
    void deleteByAppointmentID(Integer id);

    // JPQL query
    // Update reason only by id
    @Modifying
    @Transactional
    @Query("UPDATE Appointment a SET a.reason = :reason WHERE a.appointmentID = :id")
    void updateReasonById(@Param("id") Integer id, @Param("reason") String reason);
}
