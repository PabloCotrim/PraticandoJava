package br.com.generation.aula01;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
			
			int dias,meses,anos;
			System.out.println("Digite sua idade: ");
			dias = leia.nextInt();
	
			anos = dias / 365;
			meses = (dias % 365) / 30;
			dias = (dias % 365)  % 30;
			
			System.out.println("Sua idade em anos e :"  + anos + ",anos" + meses +",meses"+ dias + "dias: ");
			
	}

}
