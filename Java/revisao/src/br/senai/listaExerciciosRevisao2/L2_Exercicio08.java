package br.senai.listaExerciciosRevisao2;

public class L2_Exercicio08 {

	public static void main(String[] args) {
		int soma=0;
		
		for(int i =1; i<=100; i++) {
			if(i % 2 == 0) {
				soma += i;
			}
		}
		
		System.out.print("Soma: "+soma);

	}

}
