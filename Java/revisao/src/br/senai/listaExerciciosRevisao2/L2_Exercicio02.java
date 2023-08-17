package br.senai.listaExerciciosRevisao2;

public class L2_Exercicio02 {

	public static void main(String[] args) {
		int cont = 1, soma=0, val=1;
		
		while(cont <= 50) {
			if(val % 2 == 0) {
				soma += val;
				cont++;
			}
			val++;
		}
		
		System.out.println("Soma = "+soma);

	}

}
