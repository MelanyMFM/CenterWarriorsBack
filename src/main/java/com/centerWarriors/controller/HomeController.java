package com.centerWarriors.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class HomeController {

    @GetMapping
    public String welcome() {
        return "Bienvenido a la API de Center Warriors";
    }
}
