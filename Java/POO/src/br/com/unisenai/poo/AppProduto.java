package br.com.unisenai.poo;

import java.util.Scanner;

//Exercicio 03 - App

public class AppProduto {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int opcao = 0;
		
		Produto p1 = new Produto();
		
		System.out.println("Informe o nome do produto: ");
		p1.setNome(in.nextLine());
		
		while(p1.validaPreco == false) {
			System.out.println("Informe o preço do produto: ");
			p1.setPreco(in.nextDouble());
		}
		
		while(p1.validaQuant == false) {
			System.out.println("Informe a quantidade em estoque: ");
			p1.setQuantidadeEmEstoque(in.nextInt());
		}
		
		while(opcao != 3) {
		
		System.out.println("Opções: ");
		System.out.println("1 - Adicionar\n2 - Retirar\n3 - Sair");
		opcao = in.nextInt();
		
		if(opcao == 1) {
			System.out.println("Quantos deseja adicionar: ");
			p1.adicionarUnidade(in.nextInt());
		} else if (opcao == 2) {
			//while(p1.validaSub = false) {
				System.out.println("Quantos deseja retirar: ");
				p1.retirarUnidade(in.nextInt());
			//}
			
		} else if(opcao == 3) {
		}else {
			System.out.println("Opcão Inválida!");
		}
		
			System.out.println("\nQuantidade do produto "+p1.getNome()+", com o preço "+p1.getPreco()+" em estoque: "+p1.getQuantidadeEmEstoque()+"\n");
		}
		
		in.close();
	}

}
