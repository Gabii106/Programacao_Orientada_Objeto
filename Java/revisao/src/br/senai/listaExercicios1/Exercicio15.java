package br.senai.listaExercicios1;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Informe o primeiro lado do triângulo: ");
		double l1 = in.nextDouble();
		System.out.println("Informe o segundo lado do triângulo: ");
		double l2 = in.nextDouble();
		System.out.println("Informe o terceiro lado do triângulo: ");
		double l3 = in.nextDouble();
		
		if(l1 > 0 && l2 > 0 && l3 > 0) {
		
			if(l1 >= l2 && l1 >= l3 && (l3 + l2) >= l1 ) {
				System.out.println("É possivel formar um triângulo");
			} else if (l2 >= l1 && l2 >= l3 && (l1 + l3) >= l2) {
				System.out.println("É possivel formar um triângulo");
			} else if (l3 >= l1 && l3 >= l2 && (l2 + l1) >=l3) {
				System.out.println("É possivel formar um triângulo");
			} else {
				System.out.println("Não é possivel formar um triângulo");
			}
		
		} else {
			System.out.println("Não é possivel formar um triângulo");
		}
		
		in.close();
	}

}
