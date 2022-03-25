package com.fireStation.controller;

import com.fireStation.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {


    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }



    //Get an email list

    @GetMapping("/communityEmail")
    public List<String> listeEmails(@RequestParam(name = "city") String city) {

        return this.personService.findAllEmailsByCity(city);
    }
}
