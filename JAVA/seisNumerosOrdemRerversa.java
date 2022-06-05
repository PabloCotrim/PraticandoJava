package arraY;

public class seisNumerosOrdemRerversa {
	/*crie um vetor com 6 numeros e o mostre de forma inversa*/
	
	public static void main(String[] args) {
		int[] vetor = { -5, -6, 2, 4, 8};

		int cont = 0;
		while (cont < vetor.length) {
			System.out.println(vetor[cont]);
			cont++;
		}
		
		for(int i = (vetor.length -1);i >= 0;i--) {
			System.out.println(vetor[i]);
		}

	}

}
