package com.pessoalrafa.tabuada;
// 3. Crie uma classe `TabuadaMultiplicacao` que implementa uma interface 
// `Tabuada` com o método mostrarTabuada() para exibir a tabuada de um número.

import java.util.Scanner;

import com.pessoalrafa.interfaces.Tabuada;

//  A classe deve receber o número como parâmetro.
public class TabuadaMultiplicacao implements Tabuada{
    @Override
  public int mostrarTabuada(){
    Scanner input = new Scanner(System.in);
    System.out.println("Digite o número para exibir a tabuada: ");
    int numero = input.nextInt();

    return numero;
  } 
@Override
  public String Calculo() {
    TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
    int numero = tabuada.mostrarTabuada();
    String resultado = "";
    for (int i = 1; i <= 10; i++) {
        resultado += numero + " x " + i + " = " + numero * i + "<br>";
    }
    return resultado;
  }

}
