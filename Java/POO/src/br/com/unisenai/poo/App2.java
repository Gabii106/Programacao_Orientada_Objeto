package br.com.unisenai.poo;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Contato[] registros = new Contato[5];
		
		Scanner tec = new Scanner(System.in);
		
		for (int i = 0; i < registros.length; i++) {
			Contato contato = new Contato();
			System.out.println("Informe o nome do contato "+(i+1)+": ");
			contato.nome = tec.nextLine();
			System.out.println("Informe o email do contato "+(i+1)+": ");
			contato.email = tec.nextLine();
			System.out.println("Informe o telefone do contato "+(i+1)+": ");	
			contato.telefone = tec.nextLine();
			registros[i] = contato;
		}
		
		System.out.println("Dados cadastrados: ");
		
		for(Contato contato : registros) {//para cada registro, cria uma referencia local - Não precisa falar index
			System.out.println("Nome: "+contato.nome+" Email: "+contato.email + " Telefone: "+contato.telefone);
		}
		
		//Mesma coisa que
		//for(int i=0;i<registros.length; i++) {
		//	Contato contato = registros[i];
		//}
		
		System.out.println("Fim aplicação");
		tec.close();
	}

}
