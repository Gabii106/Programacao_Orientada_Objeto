package prova;

public class Produto {
	private String nome = "";
	private String descricao;
	private double valor = -1;
	private int estoque = -1;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String novaDescricao) {
		this.descricao = novaDescricao;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double novoValor) {
		if(novoValor >= 0) {
			this.valor = novoValor;
		} else {
			System.out.println("Valor inválido!");
		}
		
	}
	
	public int getEstoque() {
		return estoque;
	}
	
	public void setEstoque(int novoEstoque) {
		if(novoEstoque >= 0) {
			this.estoque = novoEstoque;
		} else {
			System.out.println("Quantidade do produto em estoque inválida!");
		}
	}

}
