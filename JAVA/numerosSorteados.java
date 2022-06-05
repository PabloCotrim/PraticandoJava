package arraY;

import java.util.Random;

public class numerosSorteados {

	/*
	 * Faça um programa que leia 20 numeros inteiros aleatorios (entre 0 a 100)
	 * armazene-os num vetor. ao final mostre os numeros e seus sucessores
	 */
	public static void main(String[] args) {

		int[] sort = new int[20];

		Random aleatorio = new Random();

		System.out.println(aleatorio);

		for (int i = 0; i < sort.length; i++) {
			int num = aleatorio.nextInt(100);
			sort[i] = num;

		}

		System.out.print("Numeros Aleatorios: ");
		for (int num : sort) {
			System.out.print(num + " ");
		}

		System.out.print("\nSucessores dos Numeros Aleatorios: ");
		for (int num : sort) {
			System.out.print(num + 1 + " ");
		}

		System.out.print("\nAntecessor dos Numeros Aleatorios: ");
		for (int num : sort) {
			System.out.print(num - 1 + " ");
		}

	}

}
