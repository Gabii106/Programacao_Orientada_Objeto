package br.senai.listaExercicios1;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Informe o valor do raio: ");
		double raio = in.nextDouble();
		
		double area = 3.14 * (raio * raio);
		
		System.out.println("A área do circulo é "+area);

		in.close();
	}
}
