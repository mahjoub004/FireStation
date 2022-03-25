package com.fireStation;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fireStation.model.PersonParent;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)  {
        ObjectMapper mapper = new ObjectMapper();
        try {

            PersonParent personParentObjt  = mapper.readValue(new File("/Users/jebalimahjoub/Documents/fireStation/src/main/resources/data.json"), PersonParent.class);

            System.out.println("###### Person ###########");

            Arrays.stream(personParentObjt.getPersons()).forEach(person -> {
                System.out.println("firstName : " + person.getFirstName());
                System.out.println("lastName    : " + person.getLastName());
                System.out.println("address           : " + person.getAddress());
                System.out.println("city           : " + person.getCity());
                System.out.println("zip           : " + person.getZip());
                System.out.println("phone           : " + person.getPhone());
                System.out.println("email           : " + person.getEmail());
            });



               System.out.println("###### Person ###########");
            Arrays.stream(personParentObjt.getPersons()).forEach(person -> {
                System.out.println("firstName : " + person.getFirstName());
                System.out.println("lastName    : " + person.getLastName());
                System.out.println("address           : " + person.getAddress());
                System.out.println("city           : " + person.getCity());
                System.out.println("zip           : " + person.getZip());
                System.out.println("phone           : " + person.getPhone());
                System.out.println("email           : " + person.getEmail());
            });
                          System.out.println("###### FireStation ###########");

            Arrays.stream(personParentObjt.getFirestations()).forEach(fireStaion -> {
                System.out.println("firstName : " + fireStaion.getAddress());
                System.out.println("lastName    : " + fireStaion.getStation());
            });
                          System.out.println("###### MedicalRecords ###########");

            Arrays.stream(personParentObjt.getMedicalrecords()).forEach(medicalRecords -> {
                System.out.println("firstName : " + medicalRecords.getFirstName());
                System.out.println("lastName    : " + medicalRecords.getLastName());
                System.out.println("medications    : " + medicalRecords.getMedications());
                System.out.println("allergies    : " + medicalRecords.getAllergies());
            });


        } catch (IOException e) {
            e.printStackTrace();

    }

    }
}
