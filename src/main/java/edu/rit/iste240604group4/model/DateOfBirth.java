package edu.rit.iste240604group4.model;

import jakarta.persistence.Column;

import java.time.LocalDate;


@Embedabble
public class DateOfBirth {
    @Column(name="DOB") // JPA ANNOTATION for database later on
    private LocalDate dob; // (LocalDate is a built-in class for storing dates (year,month,day)

    // CONSTRUCTOR for JPA to create objects from a DB
    public DateOfBirth(){ }

    // CONSTRUCTOR
    public DateOfBirth(LocalDate dob) { this.dob = dob; }

    // GETTER
    public LocalDate getDob() { return dob; }

    // SETTER
    public void setDob(LocalDate dob) { this.dob = dob; }

    // Calculate Age
    public int getAge() {
        return LocalDate.now().getYear() - dob.getYear();
    }
}
