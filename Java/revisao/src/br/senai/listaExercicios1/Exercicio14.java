package br.senai.listaExercicios1;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.println("Informe sua idade: ");
		int idade = in.nextInt();
		
		if(idade >= 16) {
			System.out.println("Você pode votar");
		} else {
			System.out.println("Você não pode votar");
		}
		
		in.close();
	}

}
