package br.senai.listaExercicios1;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int soma=0, aux=0;
		
		System.out.println("Informe um valor: ");
		int num = in.nextInt();
		
		String val = Integer.toString(num);
		
		for(int i = 0; i< val.length(); i++) {
			//aux = (int)val.charAt(i) - 48;
			aux = Integer.parseInt(String.valueOf(val.charAt(i)));
			soma += (aux);
		}
		
		System.out.println("Soma dos algarismos do número "+num+": "+soma);

		in.close();
	}

}
