// Fatma Almadani - 421009269

package edu.rit.iste240604group4.model;
import jakarta.persistence.*;

@Entity
@Table(name = "insurance")
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int insuranceID; // primary key

    @Column(name = "insurance_name", nullable = false)
    private String insuranceName;

    public Insurance() {
    }

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public Insurance(int insuranceID, String insuranceName) {
        this.insuranceID = insuranceID;
        this.insuranceName = insuranceName;
    }
    // getters
    public int getInsuranceID() {
        return insuranceID;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    // setters
    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public void setInsuranceID(int insuranceID) {
        this.insuranceID = insuranceID;
    }

}