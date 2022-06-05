package arraY;

import java.util.Scanner;

public class tabuada {

	/*
	 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer numero
	 * inteiro entre 1 a 10. O usuario deve informar de qual numero ele deseja ver a
	 * tabuada. A saida deve ser conforme o exemplo abaixo.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Tabuada: ");
		int tabuada = sc.nextInt();

		System.out.println("Tabuada de: " + tabuada);

		for (int i = 1; i <= 10; i++) {
			System.out.println(tabuada + " X " + i + " = " + (tabuada * i));

		}
	}
}
