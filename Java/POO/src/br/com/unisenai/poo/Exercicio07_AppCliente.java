package br.com.unisenai.poo;

import java.util.Scanner;

public class Exercicio07_AppCliente {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Exercicio07_Cliente cliente = new Exercicio07_Cliente();
		int menu = -1;
		
		System.out.println("Informe seu nome: ");
		cliente.setNome(in.nextLine());
		System.out.println("Informe seu cpf: ");
		cliente.setCpf(in.nextLine());
		System.out.println("Informe seu email: ");
		cliente.setEmail(in.nextLine());
		System.out.println("Informe seu telefone: ");
		cliente.setTelefone(in.nextLine());
		
		while(menu != 3) {
			System.out.println("1 - Ver informações\n2 - Alterar informações\n3 - Sair");
			System.out.println("Informe a opção desejada: ");
			menu = in.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("Nome: "+cliente.getNome());
				System.out.println("Cpf: "+cliente.getCpf());
				System.out.println("Email: "+cliente.getEmail());
				System.out.println("Telefone: "+cliente.getTelefone());
				break;
			case 2:
				System.out.println("O que deseja mudar: ");
				System.out.println("1 - Nome\n2 - Cpf\n3 - Email\n4 - Telefone");
				int op = in.nextInt();
				System.out.println("Para o que deseja mudar: ");
				String novo = in.next();
				cliente.configurar(op, novo);
				break;
			case 3:
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
		
		in.close();
	}

}
