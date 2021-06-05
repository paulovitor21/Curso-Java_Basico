package com.paulo.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo: ");
		double raio = scan.nextDouble();
		
		double calculoArea = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A area do circulo e: " + calculoArea);

	}

}
