package br.senai.listaExercicios1;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Informe o primeiro valor: ");
		int v1 = in.nextInt();
		System.out.println("Informe o segundo valor: ");
		int v2 = in.nextInt();
		System.out.println("Informe o terceiro valor: ");
		int v3 = in.nextInt();
		
		if(v1 >= v2 && v1 >= v3) {
			if(v2 >= v3) {
				System.out.println("Ordem crescente: "+v3+", "+v2+" e "+v1);
			}
			
			if(v3 >= v2) {
				System.out.println("Ordem crescente: "+v2+", "+v3+" e "+v1);
			}
		} else if(v2 >= v1 && v2 >= v3) {
			if(v1 >= v3) {
				System.out.println("Ordem crescente: "+v3+", "+v1+" e "+v2);
			}
			
			if(v3 >= v1) {
				System.out.println("Ordem crescente: "+v1+", "+v3+" e "+v2);
			}
		} else {
			if(v1 >= v2) {
				System.out.println("Ordem crescente: "+v2+", "+v1+" e "+v3);
			}
			
			if(v2 >= v1) {
				System.out.println("Ordem crescente: "+v1+", "+v2+" e "+v3);
			}
		}
		
		in.close();
	}
}
