package arraY;

import java.util.Scanner;

public class consoantesLidas {
	/*
	 * Faça um programa que leia um vetor de 6 caracteres e diga quantas consoantes
	 * foram lidas. imprima as consoantes
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] consoantes = new String[6];
		
		int qtdConsoantes = 0;
		
		int cont = 0;
		do {
			System.out.println("Letra: ");
			String letra = sc.nextLine();
			
			if(!(letra.equalsIgnoreCase("a") |
					letra.equalsIgnoreCase("e") |
					letra.equalsIgnoreCase("i") |
					letra.equalsIgnoreCase("o") |
					letra.equalsIgnoreCase("u"))) {
				consoantes[cont] = letra;
				qtdConsoantes++;
			}
			
			cont++;
											
	
		}while(cont < consoantes.length);
		
	//	tipo<<>>>array
		System.out.println("Consoantes: ");
		for(String c:consoantes) {
			if(c != null)
			System.out.println(c);
		}
		System.out.println("Quantidade de consoantes: "+qtdConsoantes);
	}

}
