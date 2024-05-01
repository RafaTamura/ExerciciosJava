package com.pessoalrafa.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoalrafa.calculararea.CalculadoraSalaRetangular;
import com.pessoalrafa.conversor.ConversorMoeda;



@RestController
public class Principal{

    @GetMapping("/dolar")
    public String DolarParaReal() {
        ConversorMoeda conversor = new ConversorMoeda();
        return conversor.converterDolarParaReal();

    }

    @GetMapping("/calcularsala")
    public String CalculadoraSalaRetangular(){
        CalculadoraSalaRetangular calculo = new CalculadoraSalaRetangular();
        return calculo.calcularArea() + " " + calculo.calcularPerimetro();

    }



}
