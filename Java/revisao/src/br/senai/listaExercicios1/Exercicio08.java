package br.senai.listaExercicios1;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Informe seu nome: ");
		String nome = in.nextLine();
		System.out.println("Informe sua idade: ");
		int idade = in.nextInt();
		
		if(idade >= 65) {
			System.out.println(nome+", você pode se aposentar");
		} else {
			System.out.println(nome+", você não pode se aposentar");
		}
		
		in.close();
	}

}
