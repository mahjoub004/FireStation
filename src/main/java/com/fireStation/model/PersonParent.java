package com.fireStation.model;

import java.util.Arrays;

public class PersonParent {
    private FireStaion []  firestations;
    private MedicalRecords []  medicalrecords;
    private Person []  persons;

    public PersonParent() {
    }

    public PersonParent(FireStaion[] firestations, MedicalRecords[] medicalrecords, Person[] persons) {
        this.firestations = firestations;
        this.medicalrecords = medicalrecords;
        this.persons = persons;
    }

    public FireStaion[] getFirestations() {
        return firestations;
    }

    public void setFirestations(FireStaion[] firestations) {
        this.firestations = firestations;
    }

    public MedicalRecords[] getMedicalrecords() {
        return medicalrecords;
    }

    public void setMedicalrecords(MedicalRecords[] medicalrecords) {
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
