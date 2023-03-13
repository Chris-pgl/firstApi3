package com.example.EsercizioApi3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StringController {

    // http://localhost:8080/strings?first=ciao_&second=sono_Chris

    @GetMapping(value = "/strings")
    public String concat(@RequestParam String first,
                         @RequestParam(required = false) String second){
        if (second != null){
            return first + second;
        }else{
            return first;
        }


    }




}
