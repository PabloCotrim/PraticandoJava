package AgoraFoi;

public class Loja01 {

	
	private String produtos;
	private int dados;
	
		public Loja01(String produtos, int dados) {
		super();
		this.produtos = produtos;
		this.dados = dados;
	
		}
	public String getProdutos() {
		return produtos;
	}
	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}
	public int getDados() {
		return dados;
	}
	public void setDados(int dados) {
		this.dados = dados;
	}
	
	public String toString() {
		return "Loja [produtos=" + produtos + ", dados=" + dados + "]";
	}
	

}
