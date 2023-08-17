package br.senai.listaExercicios1;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Informe uma letra: ");
		char letra = in.next().toUpperCase().charAt(0);
		
		while(Character.isLetter(letra) == false) {
			System.out.println("Não é letra, informe novamente: ");
			letra = in.next().toUpperCase().charAt(0);
		}
				
		if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
			System.out.println("A letra \""+letra+"\" é uma vogal");
		} else {
			System.out.println("A letra \""+letra+"\" é uma consoante");
		} 
		
		in.close();
	}

}
