package edu.rit.iste240604group4;

import edu.rit.iste240604group4.model.Hospital;
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
    //method to view the list of hospitals + medical records inside
    @GetMapping("/viewHospitals")
    public String viewAllHospitals(Model model){
        model.addAttribute("hospitalsList", medProService.viewHospitals());
        return "viewHospitals";

    }
    //method to view the add hospital form
    @GetMapping("/addHospital")
    public String showAddHospitalForm(){
        return "addHospital";
    }


    // POST METHODS
    @PostMapping("/addHospital")
    public String addHospital(Hospital h){
        medProService.addHospital(h);
        //"hospital" is a path variable, the success page will use it to display the message :>
        return "redirect:/add/success/hospital";
    }


}
