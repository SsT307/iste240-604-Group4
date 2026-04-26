package edu.rit.iste240604group4.service;


import edu.rit.iste240604group4.model.Appointment;
import edu.rit.iste240604group4.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    // find all
    public List<Appointment> findAllAppointments(){
        return appointmentRepository.findAll();
    }

    // save/update
    public Appointment saveAppointment(Appointment appointment){
        return appointmentRepository.save(appointment);
    }

    // find 
    public Optional<Appointment> findByAppointmentId(Integer appointmentid) {
        return appointmentRepository.findByAppointmentID(appointmentid);
    }

    // delete
    public void deleteByAppointmentId(Integer appointmentID) {
        appointmentRepository.deleteByAppointmentID(appointmentID);
    }

    // update appointment reason by id
    public void updateReasonById(Integer id, String reason) {
        appointmentRepository.updateReasonById(id, reason);
    }

}
