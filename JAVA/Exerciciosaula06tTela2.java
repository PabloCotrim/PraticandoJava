package Exc01;


public class Exerciciosaula06tTela2 {
	 

	    public static void main(String[] args) {


	    Exerciciosaula06 objeto = new Exerciciosaula06();
	    Exerciciosaula06 objeto1 = new Exerciciosaula06();

	    objeto.setNome("Pablo"); 
	    objeto.setIdade(25);
	    objeto.setEndere�o("Rua das flores -3000");
	    objeto.setCpf("787352364");

	    objeto1.setNome("Thamires"); 
	    objeto1.setIdade(35);
	    objeto1.setEndere�o("Rua das margaridas - 8992");
	    objeto1.setCpf("298326367");

	    System.out.println("Seu nome �: " + objeto.getNome());
	    System.out.println("A sua idade �: " + objeto.getIdade());
	    System.out.println("Seu endere�o: " + objeto.getEndere�o());
	    System.out.println("Seu CPF: "+ objeto.getCpf());
	    System.out.println();

	    System.out.println("Seu nome �: " + objeto1.getNome());
	    System.out.println("A sua idade �: " + objeto1.getIdade());
	    System.out.println("Seu endere�o �: " + objeto1.getEndere�o());
	    System.out.println("Seu CPF: " + objeto1.getCpf());


	    }
}



