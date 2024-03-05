package com.cj.taller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Homecontroller {

    @GetMapping("/obtenerUsuario")
    public String obtenerUsuario() {
        return "ya se";
    }

    @PostMapping("/Sumar")
    public String SumarN(@RequestParam int numero1, @RequestParam int numero2) {
        //TODO: process POST request
        int total = numero1 + numero2;
        return "suma realizada "+total;
    }
    
    
}
