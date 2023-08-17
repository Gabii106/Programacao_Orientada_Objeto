package br.senai.listaExercicios1;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
Scanner in = new Scanner (System.in);
		
		System.out.println("Informe um valor: ");
		int val = in.nextInt();
		
		boolean primo = true;
		
		for (int i=(val-1); i>1; i--) {
			if(val % i == 0) {
				primo = false;
			} 
		}
		
		if(primo == true) {
			System.out.println("Primo");
		} else {
			System.out.println("Não Primo");
		}
		
		in.close();
	}
}
