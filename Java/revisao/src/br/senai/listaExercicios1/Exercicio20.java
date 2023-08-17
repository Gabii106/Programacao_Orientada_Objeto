package br.senai.listaExercicios1;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double salFinal;
		
		System.out.println("Informe seu salário: ");
		double sal = in.nextDouble();
	
		
		if(sal <=1500) {
			salFinal = sal * 115 / 100;
			System.out.println("Aumento de 15%, resultando em R$"+salFinal);
		} else {
			salFinal = sal * 110 / 100;
			System.out.println("Aumento de 10%, resultando em R$"+salFinal);
		}

		in.close();
	}
}
