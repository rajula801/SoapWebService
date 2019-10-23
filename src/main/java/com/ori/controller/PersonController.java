package com.ori.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.ori.model.Person;

@RestController
public class PersonController {
	
	@PostMapping(path= "/display", consumes = "application/json", produces = "application/json")
    public Person display(
        @RequestHeader(name = "X-COM-PERSIST", required = true) String headerPersist,
        @RequestHeader(name = "X-COM-LOCATION", defaultValue = "ASIA") String headerLocation,
        @RequestBody Person person)
            throws Exception
    {      
        
      
        //Send location in response
        return person;
    }


}
