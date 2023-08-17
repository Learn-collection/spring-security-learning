package com.eazybytes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    @GetMapping("/myCard")
    public String getCardDetail(){
        return "Here is card detail controller";
    }

}
