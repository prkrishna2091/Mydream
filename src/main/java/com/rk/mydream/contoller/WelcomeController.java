package com.rk.mydream.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mydream")
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcomeMessage(){
        return "Welcome to Mydream site...!";
    }
}
