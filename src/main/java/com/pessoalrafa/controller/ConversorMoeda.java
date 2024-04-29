package com.pessoalrafa.controller;
import com.pessoalrafa.interfaces.ConversaoFinanceira;

public class ConversorMoeda extends ConversaoFinanceira{
    public double converterDolarParaReal(double dolar, double cotacao) {
        return dolar * cotacao;
    }


}
