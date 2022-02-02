package br.com.generation.aula01;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade,anos,meses,dias;
		
		Scanner leia = new Scanner(System.in);
			System.out.println("Digite o ano de seu nascimento: ");
			anos = leia.nextInt();
	
			System.out.println("Digite o mês de seu nascimento: ");
			meses = leia.nextInt();
	
			System.out.println("Digite o dia de seu nascimento: ");
			dias = leia.nextInt();	
	
			idade = ((2022 - anos)*365) + ((12 - meses-11)*30) + ((- 1)*( dias - 26));  
	
			System.out.println("Total de dias: " + idade);
		
	}

		
		
		

}
