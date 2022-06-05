package arraY;

import java.util.Scanner;

public class fatorial {

	/*faça um programa que calcule o fatorial de um numero inteiro fornecido pelo usuario
	 ex 5!= 120 (5 x4 x3 x2 x1)
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o numero fatorial que deseja: ");
		int fatorial = sc.nextInt();
		
		int mult=1;
		
		System.out.print(fatorial+"! = ");
		for(int i = fatorial; i >=1 ;i--) {
			mult = mult*i;
		}
		System.out.println(mult);
	}
	

}
