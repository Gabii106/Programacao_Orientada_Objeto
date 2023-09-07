package br.com.unisenai.poo;

import java.util.Scanner;

public class AppFuncionario {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		System.out.println("Informe o nome do funcionário: ");
		func.setNome(in.nextLine());
		System.out.println("Informe o departamento do funcionário: ");
		func.setDepartamento(in.nextLine());
		System.out.println("Informe o salário do funcionário: ");
		func.setSalario(in.nextDouble());
		
		System.out.println("Quanto porcento deseja aumentar o salário desse funcionário: ");
		double porc = in.nextDouble();
		
		System.out.println("Com o aumento de "+porc+"%, o salário do funcionário fica: "+func.aumentarSalario(porc));
		
		in.close();
	}

}
