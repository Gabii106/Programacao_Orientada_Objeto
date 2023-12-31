package br.com.unisenai.poo;

public class Aluno {
	private String nome;
	private double nota1; //não podem ser negativas ou acima de 10
	private double nota2;
	private double nota3;
	boolean valida1 = false;
	boolean valida2 = false;
	boolean valida3 = false;
	
	public double getNota1() {
		return this.nota1;
	}
	
	public void setNota1(double novaNota1) {
		if(novaNota1 <0 || novaNota1 > 10) {
			System.out.println("Nota 1 inválida!");
		} else {
			this.nota1 = novaNota1;
			valida1 = true;
		}
	}
	
	public double getNota2() {
		return this.nota2;
	}
	
	public void setNota2(double novaNota2) {
		if(novaNota2 <0 || novaNota2 > 10) {
			System.out.println("Nota 2 inválida!");
		} else {
			this.nota2 = novaNota2;
			valida2 = true;
		}
	}
	
	public double getNota3() {
		return this.nota3;
	}
	
	public void setNota3(double novaNota3) {
		if(novaNota3 <0 || novaNota3 > 10) {
			System.out.println("Nota 3 inválida!");
		} else {
			this.nota3 = novaNota3;
			valida3 = true;
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public double calcularMedia() {
		return ((nota1 + nota2 + nota3)/ 3);
	}
	
	
}
