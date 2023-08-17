package br.senai.listaExerciciosRevisao2;

import java.util.Scanner;

public class L2_Exercicio13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String nome = in.nextLine();
		System.out.println("Informe um número no intervalo de 2 e 10: ");
		int val = in.nextInt();
		
		while(val <3 || val > 9) {
			System.out.println("Número inválido! Informe outro valor: ");
			val = in.nextInt(); 
			
		}
		
		for(int i = 0; i<val; i++) {
			System.out.println(nome);
		}
		
		in.close();

	}

}
