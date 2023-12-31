package br.com.unisenai.poo;

//Exercicio 03

public class Produto {
	private String nome;
	private double preco;
	private int quantidadeEmEstoque;
	boolean validaPreco = false;
	boolean validaQuant = false;
	boolean validaSub = false;
	
	//Métodos
	
	public void adicionarUnidade(int add) {
		this.quantidadeEmEstoque = this.quantidadeEmEstoque + add;
	}
	
	public void retirarUnidade(int sub) {
		if(quantidadeEmEstoque > 0 && this.quantidadeEmEstoque >= sub ) {
			this.quantidadeEmEstoque = this.quantidadeEmEstoque - sub;
			validaSub = true;
		} else if( this.quantidadeEmEstoque < sub  ){
			System.out.println("\nO estoque não pode ser negativo");
		} else {
			System.out.println("\nO produto "+nome+" está fora de estoque");
		}
		
	}
	
	//Get e Set
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double novoPreco) {
		if(novoPreco > 0) {
			this.preco = novoPreco;
			validaPreco = true;
		} else {
			System.out.println("Preço inválido!");
		}
	}
	
	public int getQuantidadeEmEstoque() {
		return this.quantidadeEmEstoque;
	}
	
	public void setQuantidadeEmEstoque(int novaQuant) {
		if(novaQuant >= 0) {
			this.quantidadeEmEstoque = novaQuant;
			validaQuant = true;
		} else {
			System.out.println("Quantidade em estoque inválida!");
		}
	}
	
	
}
