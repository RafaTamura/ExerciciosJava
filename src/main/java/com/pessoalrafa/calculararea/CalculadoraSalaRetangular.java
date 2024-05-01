package com.pessoalrafa.calculararea;
import com.pessoalrafa.model.Sala;
// 2. Crie uma classe `CalculadoraSalaRetangular` que implementa uma interface 
// `CalculoGeometrico` com os métodos calcularArea() e calcularPerimetro() para 
// calcular a área e o perímetro de uma sala retangular. A classe deve receber altura 
// e largura como parâmetros.


public class CalculadoraSalaRetangular {
    
    Sala NovaSala = new Sala();
    public String calcularArea() {
        NovaSala.setAltura(10);
        NovaSala.setLargura(5);

        return
        "Area: " + NovaSala.getAltura() * NovaSala.getLargura();
    }

    public String calcularPerimetro() {
        NovaSala.setAltura(10);
        NovaSala.setLargura(5);
        return "Perímetro: " + (2 * (NovaSala.getAltura() + NovaSala.getLargura()));
    }
}