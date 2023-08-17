package br.senai.listaExerciciosRevisao2;

public class L2_Exercicio09 {

	public static void main(String[] args) {
		int soma=0;
		
		for(int i =1; i<=100; i++) {
			if(i % 2 == 1) {
				soma += i;
			}
		}
		
		System.out.print("Soma: "+soma);

	}

}
