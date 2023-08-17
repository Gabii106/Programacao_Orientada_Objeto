package br.senai.listaExerciciosRevisao2;

import java.util.Scanner;

public class L2_Exercicio06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cont =1, menor=0;
		
		while(cont <= 10) {
			
			System.out.println("Informe um valor: ");
			int val = in.nextInt();
			
			if(cont == 1) {
				menor = val;
			}
			
			if (val < menor) {
				menor = val;
			}
			
			cont++;
		}
		
		System.out.println("O menor número digitado foi "+menor);
		
		in.close();

	}

}
