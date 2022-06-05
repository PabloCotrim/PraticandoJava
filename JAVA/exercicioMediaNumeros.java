package arraY;

import java.util.Scanner;

public class exercicioMediaNumeros {

	/*
	 * faça um programa que leia 5 numeros e informe o maior numero e a media desses
	 * numeros
	 **/
	public static void main(String[] args) {

		int num, maior, media = 0, cont = 0,soma = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Numero : ");
		num = sc.nextInt();
		maior = num;

		while (cont < 5) {
			System.out.println("Numero: ");
			num = sc.nextInt();
			
			soma = soma + num;
			System.out.println("Soma: "+ soma);

			if (num > maior) {
				maior = num;
			}
			cont++;
		}

		media = soma / 5;
		System.out.println("Numero maior: " + maior);
		System.out.println("Media: " + media);
	}
}
