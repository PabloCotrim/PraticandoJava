package arraY;

import java.util.Scanner;

public class exercioMediaNumeros2 {

	/*
	 * faça um programa que leia 5 numeros
	 * 
	 * e informe o maior numero e a media desses numeros
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero, count = 0, maior = 0, soma=0,media=0;

		do {

			System.out.println("Numero: ");
			numero = sc.nextInt();
			
			soma += numero;
			System.out.println("Soma: "+soma);
			
			if (numero > maior) {
				maior = numero;
			}

			count++;

		} while (count <= 4);
		
		media = soma/5;
		
		System.out.println("Numero maior: "+maior);
		System.out.println("Media: " + media);
	}

}
