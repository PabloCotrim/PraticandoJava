package arraY;

import java.util.Scanner;

public class exercicioPararNo0 {

	/*
	 * Faça um porgrama que leia conjuntos de dois valores, o primeiro representando
	 * o nome do aluno e o segundo representando a sua idade. (pare o programa
	 * inserindo o valor 0 no campo nome)
	 */

	public static void main(String[] args) {

		int n1;
		String nome;

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("Caro aluno digite seu nome: ");
			nome = sc.nextLine();

			if (nome.equals("0"))
				break;

			System.out.println(nome + " , digite sua idade: ");
			n1 = sc.nextInt();

		}
		System.out.println("programa finalizado");

	}
}
