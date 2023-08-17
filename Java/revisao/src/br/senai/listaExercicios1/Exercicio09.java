package br.senai.listaExercicios1;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Informe o primeiro valor: ");
		int a = in.nextInt();
		System.out.println("Informe o segundo valor: ");
		int b = in.nextInt();
		
		System.out.println("Adição: "+ (a+b) );
		System.out.println("Subtração: "+ (a-b) );
		System.out.println("Multiplição: "+ (a*b) );
		System.out.println("Divisão: "+ (a/b) );
		
		in.close();
	}

}
