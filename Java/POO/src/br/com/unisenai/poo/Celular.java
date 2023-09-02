package br.com.unisenai.poo;

public class Celular {
	private String marca;
	private String modelo;
	private String numero;
	private double saldo;
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String NovaMarca) {
		this.marca = NovaMarca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String NovoModelo) {
		this.modelo = NovoModelo;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String NovoNumero) {
		this.numero = NovoNumero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double novoSaldo) {
		this.saldo = novoSaldo;
	}
	
	public void ligar() {
		if(saldo >= 1) {
			System.out.println("Fazendo a ligação...");
			saldo -= 1;
		}else {
			System.out.println("Você não tem saldo suficiente para fazer uma ligação!");
		}
	}
	
	public void mandarMensagem() {
		if(saldo >= 0.5) {
			System.out.println("Mandando a mensagem...");
			saldo -= 0.5;
		} else {
			System.out.println("Você não tem saldo suficiente para enviar uma mensagem!");
		}
	}
	
	
}
