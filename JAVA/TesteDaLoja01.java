package AgoraFoi;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteDaLoja01{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Loja01> dados1 = new ArrayList<>();
		
		System.out.println("Resultado dos dados: ");
		int resultado = sc.nextInt();
			
		for(int i=0; i < resultado; i++) {
			System.out.println("Produto comprado: ");
			String produtos = sc.next();
			
			System.out.println("Resultado da compra: ");
			int dados = sc.nextInt();
		
			dados1.add(new Loja01(produtos ,dados));
	}

		for(Loja01 i : dados1) {
			System.out.println(i);
		
	}
	}
}
