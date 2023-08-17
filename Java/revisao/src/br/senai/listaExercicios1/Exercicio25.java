package br.senai.listaExercicios1;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String binario="";
		
		System.out.println("Informe o número que deseja transformar em binário: ");
		int num = in.nextInt();
		
		while(num >= 1) {
		
		if(num % 2 == 0) {
			binario = "0" + binario ;
		} else {
			binario = "1" + binario ;
		}
		
		num = num /2;
		
		}
		
		System.out.println("Esse valor em binário é "+binario);
		
		in.close();

	}

}
