package br.senai.listaExercicios1;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.println("Informe seu nome: ");
		String nome = in.nextLine();
		System.out.println("Informe sua altura: ");
		double alt = in.nextDouble();
		System.out.println("Informe seu peso: ");
		double peso = in.nextDouble();
		
		double imc = peso / (alt * alt);
		
		System.out.println(nome+", seu IMC é "+imc);

		in.close();
	}
}
