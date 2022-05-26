package Pacote1.orientacaoaObjetos4;

import java.util.Scanner;

/* exercicio Sequencia fibonacci e uma sequencia de numeros inteiros, começando normalmente por 0 e 1, 
 no qual a cada termo subsequente corresponde a soma dos dois numeros anteriores */
public class sequenciaFibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int f1 = 0;
		int f2 = 1;

		System.out.println("Entre com o numero limite para a sequencia fibonacci: ");
		int limit = sc.nextInt();

		while (f2 < limit) {
			int fn = f1 + f2;

			if (fn > limit)
				break;

			System.out.println(fn);
			f1 = f2;
			f2 = fn;
		}

	}

}
