package br.senai.listaExerciciosRevisao2;

import java.util.Scanner;

public class L2_Exercicio11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int maior=0, menor=0, soma=0;
		double media=0;
		
		for(int i =1; i <= 5; i++) {
			System.out.println("Informe um valor inteiro e positivo: ");
			int num = in.nextInt();
			
			while(num <= 0) {
				System.out.println("Valor inválido! Informe novamente: ");
				num = in.nextInt();
			}
			
			soma += num;
			
			if(i == 1) {
				maior = num;
				menor = num;
			}
			
			if(num> maior) {
				maior = num;
			}
			
			if(num < menor) {
				menor=num;
			}
			
		}
		
		media = soma / 20;
		
		System.out.println("Média: "+media+"\nMaior: "+maior+"\nMenor: "+menor);

		
		in.close();

	}

}
