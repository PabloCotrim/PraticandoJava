package Exc01;


public class Exerciciosaula06tTela2 {
	 

	    public static void main(String[] args) {


	    Exerciciosaula06 objeto = new Exerciciosaula06();
	    Exerciciosaula06 objeto1 = new Exerciciosaula06();

	    objeto.setNome("Pablo"); 
	    objeto.setIdade(25);
	    objeto.setEndereço("Rua das flores -3000");
	    objeto.setCpf("787352364");

	    objeto1.setNome("Thamires"); 
	    objeto1.setIdade(35);
	    objeto1.setEndereço("Rua das margaridas - 8992");
	    objeto1.setCpf("298326367");

	    System.out.println("Seu nome é: " + objeto.getNome());
	    System.out.println("A sua idade é: " + objeto.getIdade());
	    System.out.println("Seu endereço: " + objeto.getEndereço());
	    System.out.println("Seu CPF: "+ objeto.getCpf());
	    System.out.println();

	    System.out.println("Seu nome é: " + objeto1.getNome());
	    System.out.println("A sua idade é: " + objeto1.getIdade());
	    System.out.println("Seu endereço é: " + objeto1.getEndereço());
	    System.out.println("Seu CPF: " + objeto1.getCpf());


	    }
}



