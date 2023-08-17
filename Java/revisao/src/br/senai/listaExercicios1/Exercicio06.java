package br.senai.listaExercicios1;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner terminal = new Scanner (System.in);

		System.out.println("Informe sua idade: ");
		int idade = terminal.nextInt();
		
		if(idade >= 18) {
			System.out.println("Você é maior de idade");
		} else {
			System.out.println("Você é menor de idade");
		}
		
		terminal.close();
	}

}
