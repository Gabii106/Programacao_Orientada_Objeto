package br.senai.listaExerciciosRevisao2;

import java.util.Scanner;

public class L2_Exercicio10ComRecursividade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		int valor = in.nextInt();
		
		while(valor > 10 || valor < 0) {
			System.out.println("Valor inválido. Informe outro: ");
			valor = in.nextInt();
		}
		
		System.out.println("O fatorial de "+valor+" é: "+Fatorial(valor)); //Isso é metodo - Evita repetição de código, organização, reduz a complexidade do código

		in.close(); 
	}
	
	public static int Fatorial(int pValor) { //Parametro por valor/cópia = Mesmo que altere o valor aqui, no outro ele permenasse o original
		if(pValor == 0) {					 //Parametro po referencia = se alterar, altera junto
			return 1;
		} else {
			return pValor * Fatorial(pValor - 1); //Isso é recursividade - Fica chamando o número necessário de vezes
		}
	}
	
	//N°    
	//5  			5 * Fatorial(4) = 120
	//Fatorial(4)   4 * Fatorial(3) = 24
	//Fatorial(3)   3 * Fatorial(2) = 6
	//Fatorial(2)   2 * Fatorial(1) = 2
	//Fatorial(1)   1 * Fatorial(0) = 1
	//Fatorial(0) 	1
	
	//private = pode ser usado apenas naquela classe --> Visibilidade												
	//public = pode usar em qualquer parte do programa --> Visibilidade
	
	//Nos parenteses é a relação entre os parametros
	
	

}
