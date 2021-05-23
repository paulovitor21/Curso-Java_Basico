package com.paulo.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner  scan= new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		
		System.out.println("Seu nome completo e: " + nomeCompleto);
		
		System.out.println("Digite seu nome:");
		String primeiroNome = scan.next();
		
		System.out.println("Seu primeiro nome e: " + primeiroNome);*/
		
		/*System.out.println("Digite sua idade:");
		int idade = scan.nextInt();
		System.out.println("A sua idade e: " + idade);*/
		
		/*System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("A sua altura e: " + altura);*/
		
		System.out.println("Digita o seu primeiro nome, idade, quantidade de filhos, altura e se tem animal de estimacao:");
		String nome = scan.next();
		int idade = scan.nextInt();
		int qtdFilhos = scan.nextInt();
		double altura = scan.nextDouble();
		String animalEstimacao = scan.next();
		
		System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nQuantidade de filhos: " + qtdFilhos + "\nAltura: " + altura + "\nTem animal de estimacao: " + animalEstimacao);

	}

}
