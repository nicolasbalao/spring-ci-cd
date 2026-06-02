package fr.eni.projet.springcicd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;


record UserInfo(String name, String email, String date){}

@RestController
public class HomeController {

    @GetMapping("/")
    public UserInfo getUserInfo() {
        return new UserInfo("Name", "email", LocalDate.now().toString());
    }

}
