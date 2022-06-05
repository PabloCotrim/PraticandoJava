package arraY;

import java.util.Random;

public class arrayMultidimensional {

	/* Gere e imprima uma matriz M 4X4 com valores aleatorios entre 0-9 */
	public static void main(String[] args) {

		Random aleatorio = new Random();
		 
		int[][] matriz = new int[4][4];
		
		for(int i = 0; i< matriz.length; i++) {
			for(int j = 0;j < matriz[i].length;j++) {
				matriz[i][j] = aleatorio.nextInt(9);
			}
			
		}
		System.out.println("Matriz: ");
		for(int[]linha: matriz) {
			for(int coluna:linha) {
				System.out.print(coluna+" | ");
			}
			System.out.println();
		}
		
	}

}
