package br.com.unisenai.poo;

import java.util.Scanner;

public class AppCelular {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Celular cell = new Celular();
		int opcao = 0;
		
		System.out.println("Informe a marca do celular: ");
		cell.setMarca(in.nextLine());
		System.out.println("Informe o modelo do celular: ");
		cell.setModelo(in.nextLine());
		System.out.println("Informe o numero do celular: ");
		cell.setNumero(in.nextLine());
		System.out.println("Informe o saldo do celular: ");
		cell.setSaldo(in.nextDouble());
		
		while(opcao != 3) {
			System.out.println("1 - Fazer uma ligação - Custa R$1,00");
			System.out.println("2 - Enviar mensagem - Custa R$0,50");
			System.out.println("3 - Sair");
			System.out.println("Escolha uma opção: ");
			opcao = in.nextInt();
			
			switch (opcao) {
			case 1:
				cell.ligar();
				System.out.println("Você possui R$"+cell.getSaldo()+" de saldo\n");
				break;
			case 2:
				cell.mandarMensagem();
				System.out.println("Você possui R$"+cell.getSaldo()+" de saldo\n");
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
