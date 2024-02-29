package com.api.primeiraapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
// * Anotação que indica que a classe é um controlador

@RequestMapping("/api/books") // Indica o endpoint que vai ser tratado pelo controller 
public class BookControler {
    @GetMapping("")
    public String getBooks() {
        return "oi";
    }
}
