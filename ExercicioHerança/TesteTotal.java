package ExercioDia01;

import java.util.Scanner;

public class TesteTotal {

	public static void main(String[] args) {
		

		Scanner leia = new Scanner(System.in);
		int velocidade;
		
		
		Cachorroo ch = new Cachorroo(); 
		Cavaloo cv = new Cavaloo();
		Preguica pg = new Preguica();
		
		
		System.out.println("Digite a velocidade do cachorro: ");
		velocidade = leia.nextInt();
		
		ch.setCorrer(velocidade);
		ch.setIdade(15);
		ch.setNome("Zabalé");
		ch.setSom("auauauau");
	
		System.out.println("CACHORRO\n");
		
		System.out.println("O Cachorro está correndo a: " + ch.getCorrer()+"km/h");
		
		System.out.println("A idade do Cachorro: " + ch.getIdade());
		System.out.println("O nome do Cachorro: " + ch.getNome());
		System.out.println("O latido: " + ch.getSom()+"\n");
		
		System.out.println("CAVALO\n");
		
		cv.setNome("CAVALO ");
		cv.setIdade(15);
		cv.setSom("IIRIRIHIHIHIHIHIR");
		cv.setGalopar(10);
		
		System.out.println("PE DE PANO: " + cv.getNome());								
		System.out.println("Idade do cavalo: "+cv.getIdade());
		System.out.println("Som do cavalo: "+cv.getSom());
		System.out.println("Velocidade da galopeada: "+cv.getGalopar()+"\n");
	
		System.out.println("BICHO PREGUIÇA\n");
		
		pg.setNome("PABLO");
		pg.setIdade(22);
		pg.setSom("AaaaahhhOUAHHHHH");
		pg.setEscala(5);
	
		System.out.println("O nome do bicho preguiça e: " + pg.getNome());
		System.out.println("O bicho preguiça tem " + pg.getIdade()+" anos");
		System.out.println("O som que o bicho preguiça faz " + pg.getSom());
		System.out.println("A velocidade da escalada de PABLO e "+ pg.getEscala()+" km/h");
	}



}
