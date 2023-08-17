package br.senai.listaExercicios1;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner terminal = new Scanner (System.in);
		
		double media=0;
		
		System.out.println("Informe a primeira nota: ");
		double n1 = terminal.nextDouble();
		System.out.println("Informe a segunda nota: ");
		double n2 = terminal.nextDouble();
		System.out.println("Informe a terceira nota: ");
		double n3 = terminal.nextDouble();
		
		media = (n1 + n2 + n3) / 3;
		
		System.out.println("A média é "+media);
		
		terminal.close();
	}

}
