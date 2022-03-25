package com.fireStation.model;

import java.util.Arrays;
import java.util.Objects;

public class MedicalRecord {

    private String firstName,lastName;
    private String[] medications;
    private String[] allergies;
    private String birthdate;

    public MedicalRecord() {
    }

    public MedicalRecord(Integer id, String firstName, String lastName, String[] medications, String[] allergies, String birthdate) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.medications = medications;
        this.allergies = allergies;
        this.birthdate = birthdate;
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

    public String[] getMedications() {
        return medications;
    }

    public void setMedications(String[] medications) {
        this.medications = medications;
    }

    public String[] getAllergies() {
        return allergies;
    }

    public void setAllergies(String[] allergies) {
        this.allergies = allergies;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "MedicalRecords{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", medications=" + Arrays.toString(medications) +
                ", allergies=" + Arrays.toString(allergies) +
                ", birthdate=" + birthdate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicalRecord that = (MedicalRecord) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Arrays.equals(medications, that.medications) && Arrays.equals(allergies, that.allergies) && Objects.equals(birthdate, that.birthdate);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, lastName, birthdate);
        result = 31 * result + Arrays.hashCode(medications);
        result = 31 * result + Arrays.hashCode(allergies);
        return result;
    }
}
