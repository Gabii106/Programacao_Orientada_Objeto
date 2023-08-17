package br.senai.listaExercicios1;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Informe um valor: ");
		String val = in.next();
		
		int o=0;
		boolean palindromo = true;
	
			o = (val.length()-1);
			for (int i = 0; i < (val.length() / 2); i++ ) {
				if(val.charAt(i) != val.charAt(o)) {
					palindromo = false;
				} 
			 o--;
			}
	
		
		if(palindromo == true) {
			System.out.println("O valor "+val+" é um palíndromo");
		} else {
			System.out.println("O valor "+val+" não é um palíndromo");
		}
		
		in.close();
	}
}
