package br.senai.listaExercicios1;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner terminal = new Scanner (System.in);

		System.out.println("Informe um número: ");
		int num = terminal.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Esse número é par!");
		} else {
			System.out.println("Esse número é impar!");
		}
		
		terminal.close();
	}

}
