package br.senai.listaExercicios1;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.println("Informe um valor: ");
		int val = in.nextInt();
		
		if (val % 3 == 0 && val % 5 == 0) {
			System.out.println(val+" é divisivel por 3 e 5");
		} else if (val % 3 == 0) {
			System.out.println(val+" é divisivel por 3 ");

		} else if (val % 5 == 0) {
			System.out.println(val+" é divisivel por 5");

		} else {
			System.out.println(val+" não é divisivel por 3 ou 5");
		}
		
		in.close();
	}
}
