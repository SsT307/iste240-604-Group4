package edu.rit.iste240604group4;

import edu.rit.iste240604group4.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MedProController {

    // Reference to the service
    @Autowired
    private MedProService medProService;


    // - - - - GET METHODS - - - -
        // --- SUCCESS PAGE
    @GetMapping("/success/{entityName}")
    public String showSuccessMessage(@PathVariable String entityName, Model model) {
        model.addAttribute("entityName", entityName);
        return "success";
    }

        // --- APPOINTMENT AND PERSON

        // --- DOCTOR
            // -- DOCTOR VIEW
        @GetMapping("/doctor")
        public String viewDoctors(Model model) {
            model.addAttribute("doctors", this.medProService.findAll());
            return "DoctorViewPage";
        }
            // -- DOCTOR FORM
        @GetMapping("/doctor/add")
        public String showAddDoctorForm(Model model) {
            return "DoctorAddPage";
        }

        // --- HOSPITAL AND MEDICAL RECORDS
            // -- LIST OF HOSPITAL AND MEDICAL RECORDS
    @GetMapping("/hospitals")
    public String viewAllHospitals(Model model){
        model.addAttribute("hospitalsList", medProService.viewHospitals());
        return "viewHospitals";

    }
            // -- VIEW ADD HOSPITAL FORM
    @GetMapping("/hospitals/add")
    public String showAddHospitalForm(){
        return "addHospital";
    }

        // --- INSURANCE

    // - - - - POST METHODS - - - -
        // --- DOCTOR ADD
    @PostMapping("/doctor/add")
    public String addDoctor(Doctor doctor, Model model) {
        //save doc
        this.medProService.addDoctor(doctor);
        //inject doc to template
        model.addAttribute("doctors",this.medProService.findAll());
        return "redirect:/success/doctor";
    }

        // --- ADD HOSPITAL
    @PostMapping("/hospitals/add")
    public String addHospital(Hospital h){
        medProService.addHospital(h);
        //"hospital" is a path variable, the success page will use it to display the message :>
        return "redirect:/success/hospital";
    }


}
