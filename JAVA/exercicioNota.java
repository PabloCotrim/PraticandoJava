package arraY;

import java.util.Scanner;

public class exercicioNota {

	public static void main(String[] args) {

		/*
		 * Faça um programa que peça uma nota, entre zero e dez, Mostre uma mensagem
		 * caso o valor seja invalido e continue pedindo ate que o usuario informe o
		 * valor valido
		 */

		int nota = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com uma nota entre 0 e 10: ");
		nota = sc.nextInt();

		while (nota < 0 || nota > 10) {

			System.out.println("Entre com uma nota entre 0 e 10, por favor digite entre esses numeros");
			nota = sc.nextInt();
		}

	}

}
