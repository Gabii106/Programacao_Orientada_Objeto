package br.com.unisenai.poo;

//Exercicio 01

public class Pessoa {
		private int idade;
		private String nome;
		
		public int getIdade() {
			return this.idade;
		}
		
		public void setIdade(int novaIdade) {
			if(novaIdade >= 0) {
			this.idade = novaIdade;
			} else {
				System.out.println("Idade inválida!");
			}
		}
		
		public String getNome() {
			return this.nome;
		}
		
		public void setNome(String novoNome) {
			this.nome = novoNome;
		}

}
