package br.senai.listaExercicios1;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Informe o primeiro valor: ");
		int v1 = in.nextInt();
		System.out.println("Informe o segundo valor: ");
		int v2 = in.nextInt();
		System.out.println("Informe o terceiro valor: ");
		int v3 = in.nextInt();
		
		if(v1 >= v2 && v1 >= v3) {
			System.out.println("O maior valor é "+v1);
		} else if (v2 >= v1 && v2 >= v3) {
			System.out.println("O maior valor é "+v2);
		} else {
			System.out.println("O maior valor é "+v3);
		}

		in.close();
	}

}
