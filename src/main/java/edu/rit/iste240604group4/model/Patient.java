package edu.rit.iste240604group4.model;
import org.springframework.stereotype.Component;

@Component
public class Patient {
    private int emiratesID; //PRIMARY KEY
    private String firstName;
    private String lastName;
    private String ethnicity;

    //GETTERS
    public int getEmiratesID() {return emiratesID;}
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEthnicity() {
        return ethnicity;
    }

    //SETTERS
    public void setEmiratesID(int emiratesID) {
        this.emiratesID = emiratesID;
    }
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }
}
