package br.senai.listaExercicios1;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
Scanner in = new Scanner (System.in);
		
		System.out.println("Informe um caracter: ");
		char abc = in.next().charAt(0);
		
		char mais = Character.toUpperCase(abc);
		
		if(abc == '0'|| abc == '1'||abc == '2'||abc == '3'||abc == '4'||abc == '5'||abc == '6'||abc == '7'||abc == '8'||abc == '9') {
			System.out.println(abc+" é um número!");
		} else if(Character.isLetter(abc)) {
			if (abc == mais) {
				System.out.println(abc+" é uma letra maiúscula!");
			} else {
				System.out.println(abc+" é uma letra minúscula!");
			}
		} else {
			System.out.println(abc+" é um caractere especial!");

		}
		
		in.close();

	}

}
