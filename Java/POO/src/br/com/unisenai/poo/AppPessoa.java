package br.com.unisenai.poo;

//Exercicio 01 - App

public class AppPessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		p1.setNome("João");
		p1.setIdade(-10);
		
		System.out.println("Nome: "+p1.getNome());
		System.out.println("Idade: "+p1.getIdade());
	}
}
