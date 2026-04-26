// Tania Aziz - 418005117
package edu.rit.iste240604group4.model;

import jakarta.persistence.*;


@Entity
@Table(name= "hospital")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment the PK value
    private int hospitalID; //Primary Key
    private String name;
    private String owner;

    //empty constructor
    public Hospital() {
    }

    public Hospital(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    //Getters
    public int getHospitalID() {
        return hospitalID;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }


    //Setters
    public void setHospitalID(int hospitalID) {
        this.hospitalID = hospitalID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


}