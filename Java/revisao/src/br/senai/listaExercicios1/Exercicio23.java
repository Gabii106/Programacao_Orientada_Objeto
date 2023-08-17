package br.senai.listaExercicios1;

import java.util.Random;
import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		Random aleatorio = new Random();
		
		int num = aleatorio.nextInt(0, 100);
		//System.out.println(num);
		
		System.out.println("Informe um valor: ");
		int val = in.nextInt();
		
		while (val != num) {
			System.out.println("Errado, informe outro número: " );
			val = in.nextInt();
		}
		
		System.out.println("Acertou!!!");
		
		in.close();
	}
}
