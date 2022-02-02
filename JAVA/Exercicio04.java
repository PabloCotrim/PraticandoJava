package br.com.generation.Exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int numero = 0;
		double raiz, potencia;
			System.out.println("Digite um numero inteiro: ");
			numero = leia.nextInt();
	
			if(numero % 2 == 0) {
				System.out.println("Par: ");
				raiz = Math.sqrt(numero);
				System.out.println("Raiz quadrada: "+raiz);
	}
			else {

					System.out.println("Impar: ");
					potencia = Math.pow(numero, 2);
					System.out.println("Potencias: "+potencia);
			}
	
	
	}

}
