package br.senai.revisao_fundamentos_java;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> itens = new ArrayList<>();
		Produto prod;
		boolean zero = false;
		
		while(zero == false) {
			prod = new Produto();
			
			System.out.println("Informe o código do produto: ");
			prod.setCodigo(sc.nextInt());
			
			if(prod.getCodigo() != 0) {
				System.out.println("Informe o ean do produto: ");
				prod.setEan(sc.next());
				System.out.println("Informe o nome do produto: ");
				prod.setNome(sc.next());
				System.out.println("Informe o valor do produto: ");
				prod.setValor(sc.nextDouble());
				System.out.println("Informe a quantidade do produto: ");
				prod.setQtde(sc.nextInt());
				
				itens.add(prod);	
			} else {
				zero = true;
			}
		}
		
		System.out.println("Produtos cadastrados: ");
		for(int i =0; i < itens.size(); i++) {
			System.out.println(itens.get(i).toString());
		}
		
		
		
		sc.close();
	}

}
