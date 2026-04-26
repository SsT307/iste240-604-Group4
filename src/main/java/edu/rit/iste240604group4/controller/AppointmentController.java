// Shaikha Alhajri 418008663

package edu.rit.iste240604group4.controller;


import edu.rit.iste240604group4.model.Appointment;
import edu.rit.iste240604group4.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    // VIEW list of appointments
    @GetMapping
    public List<Appointment> getAllAppointments() {
        return appointmentService.findAllAppointments();
    }

    // retrieve one appointment by id
    @GetMapping("/{id}")
    public Optional<Appointment> getAppointmentById(@PathVariable Integer id){
        return appointmentService.findByAppointmentId(id);
    }

    // search appointments by id
    @GetMapping("/search")
    public Optional<Appointment> searchAppointments(@RequestParam Integer appointmentid) {
        return appointmentService.findByAppointmentId(appointmentid);
    }

    // create appointment
    @PostMapping
    public Appointment addAppointment(@RequestBody Appointment appointment) {
        return appointmentService.saveAppointment(appointment);
    }

    // update whole appointment row
    @PutMapping("/{id}")
    public Appointment updateAppointment(@PathVariable Integer id, @RequestBody Appointment appointment) {
        appointment.setAppointmentID(id);
        return appointmentService.saveAppointment(appointment);
    }

    // update only reason by id
    @PutMapping("/{id}/reason")
    public void updateReason(@PathVariable Integer id, @RequestParam String reason) {
        appointmentService.updateReasonById(id, reason);
    }

    // delete appointment by id
    @DeleteMapping("/{id}")
    public String deleteAppointment(@PathVariable Integer id) {
        appointmentService.deleteByAppointmentId(id);
        return "Appointment Deleted Successfully!";
    }


}
