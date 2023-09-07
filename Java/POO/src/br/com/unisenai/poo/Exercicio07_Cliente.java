package br.com.unisenai.poo;

public class Exercicio07_Cliente {
	
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void configurar(int opcao, String novo) {
		switch(opcao) {
		case 1:
			this.nome = novo;
			break;
		case 2:
			this.cpf = novo;
			break;
		case 3:
			this.email = novo;
			break;
		case 4:
			this.telefone = novo;
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
		
		
	}
	
	

}
