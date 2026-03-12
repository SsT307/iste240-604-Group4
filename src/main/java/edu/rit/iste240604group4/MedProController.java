package edu.rit.iste240604group4;

import edu.rit.iste240604group4.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MedProController {

    // Reference to the service
    @Autowired
    private MedProService medProService;


    // GET METHODS
    // DOCTOR VIEW
    @GetMapping("/doctor")
    public String viewDoctors(Model model) {
        model.addAttribute("doctors", this.medProService.findAll());
        return "DoctorViewPage";
    }
    // DOCTOR FORM
    @GetMapping("/doctor/add")
    public String showAddDoctorForm() {
        return "DoctorAddPage";
    }
    // POST METHODS
    // DOCTOR ADD
    @PostMapping("/doctor/add")
    public String addDoctor(Doctor doctor, Model model) {
        //save doc
        this.medProService.addDoctor(doctor);
        //inject doc to template
        model.addAttribute("doctors",this.medProService.findAll());
        return "redirect:/success/doctor";
    }
}
