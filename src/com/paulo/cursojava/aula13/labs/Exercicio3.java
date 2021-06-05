package com.paulo.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero1 = teclado.nextInt();
		
		System.out.println("Digite outro numero: ");
		int numero2 = teclado.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("Resultado: " + soma);

	}

}
