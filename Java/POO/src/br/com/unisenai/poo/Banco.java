package br.com.unisenai.poo;

public class Banco {
	private String nome, cnpj;
	private double saldo;
	boolean validaDep = false;
	
	//Método
	
	public void depositar(double adicionar) {
		if(adicionar > 0 && adicionar < 5000) {
			this.saldo += adicionar;
			validaDep = true;
		} else {
			System.out.println("Não é possível adicionar esse valor!");
		}
	}
	
	//Get e Set
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public void setCnpj(String novoCnpj) {
		this.cnpj = novoCnpj;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double novoSaldo) {
		//if(novoSaldo >= 0) {
			this.saldo = novoSaldo;
		//} else {
			
		//}
	}
}
