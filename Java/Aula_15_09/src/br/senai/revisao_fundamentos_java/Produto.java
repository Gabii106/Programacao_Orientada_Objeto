package br.senai.revisao_fundamentos_java;

public class Produto {
	private int Codigo;
	private String Ean;
	private String nome;
	private double valor;
	private int qtde;
	
	public Produto (int codigo, String ean, String nome, double valor, int qtde){
		this.Codigo = codigo;
		this.Ean = ean;
		this.nome = nome;
		this.valor = valor;
		this.qtde = qtde;

	}
	
	public Produto(int codigo, String nome) {
		this.Codigo = codigo;
		this.nome = nome;
	}
	
	public Produto() {
		this.Codigo = -1;
	}
	//Get e Set
	
	public int getCodigo() {
		return Codigo;
	}
	
	public void setCodigo(int codigo) {
		this.Codigo = codigo;
	}
	
	public String getEan() {
		return Ean;
	}
	
	public void setEan(String ean) {
		this.Ean = ean;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getQtde() {
		return qtde;
	}
	
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
@Override
	
	public String toString() {
		return this.Codigo + " - " + this.nome;
	}
	
	
}
