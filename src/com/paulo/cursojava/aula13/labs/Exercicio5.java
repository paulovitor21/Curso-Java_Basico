package com.paulo.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor em metros: ");
		double valMetros = scan.nextDouble();
		
		double convertCentimetros = valMetros*100;
		
		System.out.println(valMetros + "m e igual a " + convertCentimetros + " cm");

	}

}
