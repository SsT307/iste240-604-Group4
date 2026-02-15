package edu.rit.iste240604group4.model;

import org.springframework.stereotype.Component;

@Component
public class Hospital {
    private int hospitalID; //Primary Key
    private String name;
    private String owner;
    
    //Getters
    public int getHospitalID() { return hospitalID; }

    public String getName() { return name; }

    public String getOwner() { return owner; }

    //Setters
    public void setHospitalID(int hospitalID) { this.hospitalID = hospitalID; }

    public void setName(String name) { this.name = name; }

    public void setOwner(String owner) { this.owner = owner; }

}
