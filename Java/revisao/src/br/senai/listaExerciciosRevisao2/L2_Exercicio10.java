package br.senai.listaExerciciosRevisao2;

import java.util.Scanner;

public class L2_Exercicio10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int fat = 1;

		
		System.out.println("Informe um número entre 2 e 5: ");
		int num = in.nextInt();
		
			for(;num > 5 || num < 2; ) {
				System.out.println("Número inválido! Informe outro valor: ");
				num = in.nextInt();
		}
		
		System.out.print(num+"! = ");
		
		for(int i = 1; i <= num; i++) {
			fat *= i;
			
			if(i == num ) {
				System.out.print(i);
			} else {
				System.out.print(i + " * ");

			}
			
		}
		
		System.out.print(" = "+fat);
		
		in.close();
		
	}

}
