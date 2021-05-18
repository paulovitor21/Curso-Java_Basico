package com.paulo.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		// convenção Java
		int idade = 20;
		String nome = "Loiane";
		String nomeDoMeuCachorro = "toto";
		String ano2014 = "2014";
		
		// aceito, mas não utilizado
		int _idade;
		int $idade;
		
		// não é convenção Java
		String nome_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDomeucachorro;
		
		idade = 25;
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		System.out.println("Nome do meu cachorro = " + nomeDoMeuCachorro);
		
		// má prática
		int a = 10;
		String b = "Loiane";
	}

}
