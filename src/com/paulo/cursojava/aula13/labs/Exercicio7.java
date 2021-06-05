package com.paulo.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado: ");
		double ladoQuadrado = scan.nextDouble();
		
		double calculoAreaQuadrado = Math.pow(ladoQuadrado, 2);
		
		System.out.println("O dobro desta area: " + ladoQuadrado);
		System.out.println("O dobro desta area: " + calculoAreaQuadrado*2);

	}

}
