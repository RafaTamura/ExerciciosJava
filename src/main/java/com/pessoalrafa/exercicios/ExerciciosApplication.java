package com.pessoalrafa.exercicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.pessoalrafa.controller", "com.pessoalrafa.conversor", "com.pessoalrafa.model", "com.pessoalrafa.interfaces"})
public class ExerciciosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosApplication.class, args);
	}

}
