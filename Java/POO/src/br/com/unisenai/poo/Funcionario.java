package br.com.unisenai.poo;

public class Funcionario {
	private String nome;
	private double salario;
	private String departamento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if(salario >= 0) {
			this.salario = salario;
		}
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public double aumentarSalario(double porcentagem) {
		this.salario = this.salario + (this.salario * porcentagem/100);
		return this.salario;
	}
	

}
