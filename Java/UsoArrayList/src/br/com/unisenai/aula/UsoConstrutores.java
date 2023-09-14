package br.com.unisenai.aula;

public class UsoConstrutores {
	
	public static void main(String[] args) {
		//Pessoa p = new Pessoa();
		//System.out.println(p.nome);
		//System.out.println(p.idade);
		
		Pessoa p2 = new Pessoa(5);
		System.out.println(p2.nome);
		System.out.println(p2.idade);
		
		Pessoa p3 = new Pessoa("Ana",3);
		System.out.println(p3.nome);
		System.out.println(p3.idade);
	}
}
