package br.com.unisenai.poo;

import java.util.Scanner;

public class AppBanco {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String resp = "S";
		
		Banco b1 = new Banco();

		System.out.println("Informe seu nome: ");
		b1.setNome(in.nextLine());
		System.out.println("Informe seu cnpj: ");
		b1.setCnpj(in.nextLine());
		System.out.println("Informe seu saldo: ");
		b1.setSaldo(in.nextDouble());
		
		while(!resp.equals("N")) {
			
				System.out.println("Deseja depositar: (S/N)");
				resp = in.next().toUpperCase();
			
			if(resp.equals("S")) {
				while(b1.validaDep == false) {
				System.out.println("Qual valor deseja depositar: ");
				b1.depositar(in.nextDouble());
				}
				b1.validaDep = false;
				System.out.println("Saldo atual: "+b1.getSaldo());
			} else if(!resp.equals("N")) {
				System.out.println("Resposta inválida!");
			} 
		}
		
		in.close();
	}

}
