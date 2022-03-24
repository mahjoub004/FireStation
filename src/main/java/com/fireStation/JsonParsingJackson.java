package com.fireStation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fireStation.model2.EmployeeParent;
import com.fireStation.model2.Skills;

import java.io.File;
import java.io.IOException;

public class JsonParsingJackson {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            EmployeeParent empParentObj = objectMapper.readValue(new File("/Users/jebalimahjoub/Documents/fireStation/src/main/resources/data2.json"), EmployeeParent.class);
            //Print info directly
            System.out.println("###### Emp Info Jackson############");
            System.out.println("Emp Name     : " + empParentObj.getEmpInfo().getName());
            System.out.println("Emp Age      : " + empParentObj.getEmpInfo().getAge());

            System.out.println("Emp Position : " + empParentObj.getEmpInfo().getPosition());
            System.out.println("Emp Salary   : " + empParentObj.getEmpInfo().getSalary());

            //parsing nested list
            System.out.println("###### Emp Skills ###########");
            for(Skills skill : empParentObj.getSkills()) {
                System.out.println("Promrammming : " + skill.getProgramming());
                System.out.println("Scripting    : " + skill.getScripting());
                System.out.println("MI           : " + skill.getMl());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}