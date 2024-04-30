package com.pessoalrafa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoalrafa.conversor.ConversorMoeda;

@RestController
public class Principal{

    @GetMapping("/teste")
    public String DolarParaReal() {
        ConversorMoeda conversor = new ConversorMoeda();
        return conversor.converterDolarParaReal();

    }

}
