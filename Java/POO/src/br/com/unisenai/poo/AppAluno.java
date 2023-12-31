package br.com.unisenai.poo;

import java.util.Scanner;

public class AppAluno {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Aluno a1 = new Aluno();
		
		System.out.println("Informe o nome do aluno: ");
		a1.setNome(in.nextLine());
		
		while(a1.valida1 == false) {
			System.out.println("Informe a 1ª nota: ");
			a1.setNota1(in.nextDouble());
		}
		
		while(a1.valida2 == false) {
			System.out.println("Informe a 2ª nota: ");
			a1.setNota2(in.nextDouble());
		}
		
		while(a1.valida3 == false) {
			System.out.println("Informe a 3ª nota: ");
			a1.setNota3(in.nextDouble());
		}
		
		System.out.println("Aluno: "+a1.getNome());
		System.out.println("Notas: ");
		System.out.println("1ª: "+a1.getNota1()+"\n2ª: "+a1.getNota2()+"\n3ª: "+a1.getNota3());
		System.out.println("Média: "+a1.calcularMedia());
		
		in.close();
		
	}
}
