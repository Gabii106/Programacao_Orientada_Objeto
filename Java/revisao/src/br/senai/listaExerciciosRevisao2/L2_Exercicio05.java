package br.senai.listaExerciciosRevisao2;

import java.util.Scanner;

public class L2_Exercicio05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Menu: ");
		System.out.println("1 - Sacar");
		System.out.println("2 - Depositar");
		System.out.println("3 - Verificar Saldo");
		System.out.println("4 - Sair\n");
		
		int menu  = 1;

		while(menu != 4) {
		
		System.out.print("Qual opção deseja escolher: ");
		menu = in.nextInt();
		
			switch(menu) {
				case 1:
					System.out.println("Você escolheu a opção Sacar\n");
					break;
				case 2:
					System.out.println("Você escolheu a opção Depositar\n");
					break;
				case 3:
					System.out.println("Você escolheu a opção Verificar Saldo\n");
					break;
				case 4:
					System.out.println("Você escolheu a opção Sair\n");
					break;
				default:
					System.out.println("Opção inválida!\n");
					break;	
			}
	
		}
		
		
		in.close();
	}

}
