package arraY;

import java.util.Scanner;

public class parEImpar {

	/*
	 * faça um programa que peça N numeros inteiros, calcule e mostre a quantidade
	 * de numeros pares e a quantidade de numeros impares
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qtdNumeros, qtdPares = 0, qtdImpares = 0;
		int numero;

		System.out.println("Quantidade de números: ");
		qtdNumeros = sc.nextInt();

		int cont = 0; 
		do {
			System.out.println("Numero: ");
			numero = sc.nextInt();

			if (numero % 2 == 0) {
				qtdPares++;
			} else {
				qtdImpares++;
			}

			cont++;
		} while (cont < qtdNumeros);
		System.out.println("quantidade pares: "+qtdPares);
		System.out.println("quantidade impares: "+qtdImpares);
	}

}
