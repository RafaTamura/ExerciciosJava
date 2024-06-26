package com.pessoalrafa.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoalrafa.calculararea.CalculadoraSalaRetangular;
import com.pessoalrafa.conversor.ConversorMoeda;
import com.pessoalrafa.interfaces.Tabuada;
import com.pessoalrafa.tabuada.TabuadaMultiplicacao;



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

@GetMapping("/tabuada")
public String TabuadaMultiplicacao(){
    Tabuada tabuada = new TabuadaMultiplicacao();
    return tabuada.Calculo();

}





}
