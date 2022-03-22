package com.fireStation.model;

import java.time.LocalDate;
import java.util.Objects;

public class MedicalRecords {
    private Integer id;
    private String firstName,lastName,medications,allergies;
    private LocalDate birthdate;

    public MedicalRecords() {
    }

    public MedicalRecords(Integer id, String firstName, String lastName, String medications, String allergies, LocalDate birthdate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.medications = medications;
        this.allergies = allergies;
        this.birthdate = birthdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMedications() {
        return medications;
    }

    public void setMedications(String medications) {
        this.medications = medications;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "MedicalRecords{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", medications='" + medications + '\'' +
                ", allergies='" + allergies + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicalRecords that = (MedicalRecords) o;
        return Objects.equals(id, that.id) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(medications, that.medications) && Objects.equals(allergies, that.allergies) && Objects.equals(birthdate, that.birthdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, medications, allergies, birthdate);
    }
}
