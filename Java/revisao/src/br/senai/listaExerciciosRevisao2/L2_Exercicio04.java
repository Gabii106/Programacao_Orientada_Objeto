package br.senai.listaExerciciosRevisao2;

import java.util.Scanner;

public class L2_Exercicio04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int cont=1, fatorial=1;
		
		System.out.println("Informe um número entre 2 e 5: ");
		int num = in.nextInt();
		
		while(num > 5 || num < 2) {
			System.out.println("Número inválido! Informe outro valor: ");
			num = in.nextInt();
		}
		
		System.out.print(num+"! = ");
		
		while(cont <= num) {
			fatorial = fatorial * cont;
			
			if(cont == num ) {
				System.out.print(cont);
			} else {
				System.out.print(cont + " * ");

			}
			cont++;
		}
		
		System.out.print(" = "+fatorial);
		
		in.close();

	}

}

//Do while = executa e dps testa, o bloco é sempre executado pelo menos 1 vez
