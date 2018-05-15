package com.partha.gcp.samplegcpproject.services;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello World";
    }
}
