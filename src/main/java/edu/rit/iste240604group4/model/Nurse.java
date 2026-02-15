package edu.rit.iste240604group4.model;
import org.springframework.stereotype.Component;

@Component
public class Nurse {
    private int nurseID; //PRIMARY KEY
    private String firstName;
    private String lastName;
    private int hospitalID; //FOREIGN KEY

    //GETTERS
    public int getNurseID() {
        return nurseID;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getHospitalID() {
        return hospitalID;
    }

    //SETTERS
    public void setNurseID(int nurseID) {
        this.nurseID = nurseID;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setHospitalID(int hospitalID) {
        this.hospitalID = hospitalID;
    }
}
