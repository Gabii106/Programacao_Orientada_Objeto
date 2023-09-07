package br.com.unisenai.poo;

import java.util.Scanner;

public class AppPedidoOnline {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PedidoOnline ped = new PedidoOnline();
		int menu = 0;
		
		System.out.println("Informe o id do pedido online: ");
		ped.setId(in.nextInt());
		System.out.println("Informe a data do pedido online: ");
		ped.setData(in.next());
		System.out.println("Informe o valor total do pedido online: ");
		ped.setValorTotal(in.nextDouble());
		System.out.println("Informe o status do pedido online: ");
		ped.setStatus(in.next());
		
		while(menu != 3) {
			System.out.println("1 - Ver informações\n2 - Alterar informações\n3 - Sair");
			System.out.println("Informe a opção desejada: ");
			menu = in.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("Id: "+ped.getId());
				System.out.println("Data: "+ped.getData());
				System.out.println("Valor total: "+ped.getValorTotal());
				System.out.println("Status: "+ped.getStatus());
				break;
			case 2:
				System.out.println("O que deseja mudar: ");
				System.out.println("1 - Id\n2 - Data\n3 - Valor total\n4 - Status");
				int escolha = in.nextInt();
				System.out.println("Para o que deseja mudar: ");
				switch(escolha) {
				case 1:
					ped.setId(in.nextInt());
					break;
				case 2:
					ped.setData(in.next());
					break;
				case 3:
					ped.setValorTotal(in.nextDouble());
					break;
				case 4:
					ped.setStatus(in.next());
					break;
				default:
					System.out.println("Opção inválida!");
					break;
					
				}
				
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
