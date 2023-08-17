package br.senai.listaExercicios1;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean biss = false;

		System.out.println("Informe um ano: ");
		int ano = in.nextInt();
		
		while(ano <= 0) {
			System.out.println("Ano inválido! Informe outro: ");
		}
		
		int val=ano;
		
		if(ano <= 2024) {
		
		while(val <= 2024) {
			if(val == 2024) {
				biss = true;
			}
			val+= 4;
		}
		}
		
		else {
			if(ano > 2024) {
				
				while(val >= 2024) {
					if(val == 2024) {
						biss = true;
					}
					val-= 4;
				}
				
				
				}
		}
		
		if(biss) {
			System.out.println("O ano "+ano+" é bissexto");
		} else {
			System.out.println("O ano "+ano+" não é bissexto");
		}
		
		in.close();
	}

}
