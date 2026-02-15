package edu.rit.iste240604group4.model;

import org.springframework.stereotype.Component;

@Component
public class Insurance {
    private int insuranceID; //Primary Key
    private String insuranceName;

    //Getters
    public int getInsuranceID() { return insuranceID; }

    public String getInsuranceName() { return insuranceName; }

    //Setters
    public void setInsuranceID(int insuranceID) { this.insuranceID = insuranceID; }

    public void setInsuranceName(String insuranceName) { this.insuranceName = insuranceName; }
}
