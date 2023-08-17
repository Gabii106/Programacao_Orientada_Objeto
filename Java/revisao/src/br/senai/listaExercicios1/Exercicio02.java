package br.senai.listaExercicios1;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner terminal = new Scanner (System.in);
		
		System.out.println("Informe o primeiro valor: ");
		int a = terminal.nextInt();
		System.out.println("Informe o segundo valor: ");
		int b = terminal.nextInt();
		
		System.out.println("A soma é " + (a+b) );
		
		terminal.close();
	}

}
