package br.senai.listaExercicios1;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner terminal = new Scanner (System.in);

		System.out.println("Informe um número inteiro: ");
		int num = terminal.nextInt();
		
		if(num == 0) {
			System.out.println("Esse número é zero");
		} else if (num > 0) {
			System.out.println("Esse número é positivo");
		} else {
			System.out.println("Esse número é negativo");
		}
		
		terminal.close();
	}

}
