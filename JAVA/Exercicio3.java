package br.com.generation.aula01;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
		//aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5. respecitivamente

		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3,media;
		System.out.println("Digite a primeira nota: ");
		n1=leia.nextInt();
	
		System.out.println("Digite a segunda nota: ");
		n2=leia.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		n3=leia.nextInt();
	
		media = (n1*2 + n2*3 + n3*5) / (2+3+5);
	
		System.out.println("Media final: "+ media);
	
	}

}
