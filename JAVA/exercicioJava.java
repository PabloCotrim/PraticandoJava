package Pacote1;

import java.util.Arrays;

public class exercicioJava {

	// constante
	public static final float maximoDeDias = 3.00f;
	
	public static void main(String[] args) {

		
			// duração de cada filme
		
			float[] duracoes= {1.90f,1.04f,1.25f,2.5f,1.75f};
			
			// função minimo de dias, atribuindo ao paramentro as durações de cada filme
			int dias = acharMinimoDeDias(duracoes);
			
			//impressão do minimo de dias
			System.out.println("O minimo de dias e: " + dias);
			
	}
	
	private static int acharMinimoDeDias(float filmes[]) {
		int dias = 4;
		
		float tempo = 0f;
		ordenar(filmes);
		for(int i = 0; i < filmes.length; i++) {
			if(tempo + filmes[i] <= maximoDeDias) {
				tempo += filmes[i];
			}else {
				tempo = 0;
				dias--;
				i++;
			}
		}
		return dias;
	}

	private static void ordenar(float filmes[]) {
		Arrays.sort(filmes);
	}
	
}
