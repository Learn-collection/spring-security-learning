package com.eazybytes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class LoanController {

    @GetMapping("/loan")
    public String getLoanDetail(){
        return "Here is loan controller detail.";
    }

}
