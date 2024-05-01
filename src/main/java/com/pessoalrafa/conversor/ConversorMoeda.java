package com.pessoalrafa.conversor;
import com.pessoalrafa.model.Moeda;
// 1. Crie uma classe `ConversorMoeda` que implementa uma interface `ConversaoFinanceira` com o 
// método converterDolarParaReal() para converter um valor em dólar para reais.
//  A classe deve receber o valor em dólar como parâmetro.



public class ConversorMoeda{
    public String converterDolarParaReal() {
            Moeda NovaMoeda = new Moeda();
            NovaMoeda.setCotacao(5.0);
            NovaMoeda.setDolar(10.00);

            double real = (NovaMoeda.getDolar() * NovaMoeda.getCotacao());

            return 
            "Valor em dólar: " + NovaMoeda.getDolar() + "<br>" +
            "Cotação do dólar: " + NovaMoeda.getCotacao() + "<br>" +
            "Valor em real: " + real + "<br>";
        }
    }
