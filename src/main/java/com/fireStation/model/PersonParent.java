package com.fireStation.model;

import java.util.Arrays;

public class PersonParent {
    private FireStation[]  firestations;
    private MedicalRecord[]  medicalrecords;
    private Person []  persons;

    public PersonParent() {
    }

    public PersonParent(FireStation[] firestations, MedicalRecord[] medicalrecords, Person[] persons) {
        this.firestations = firestations;
        this.medicalrecords = medicalrecords;
        this.persons = persons;
    }

    public FireStation[] getFirestations() {
        return firestations;
    }

    public void setFirestations(FireStation[] firestations) {
        this.firestations = firestations;
    }

    public MedicalRecord[] getMedicalrecords() {
        return medicalrecords;
    }

    public void setMedicalrecords(MedicalRecord[] medicalrecords) {
        this.medicalrecords = medicalrecords;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "PersonParent{" +
                "firestations=" + Arrays.toString(firestations) +
                ", medicalrecords=" + Arrays.toString(medicalrecords) +
                ", persons=" + Arrays.toString(persons) +
                '}';
    }
}
