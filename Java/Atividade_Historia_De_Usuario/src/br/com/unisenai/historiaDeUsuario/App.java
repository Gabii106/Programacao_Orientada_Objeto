package br.com.unisenai.historiaDeUsuario;

import java.util.Scanner;

public class App {

	public static void main(String[] args) { //Classe principal - classe com main
		Scanner leitor = new Scanner(System.in);
		CartaoView view = new CartaoView(leitor); //Instancia a classe CartaoView
		view.menu(); 
		leitor.close();

	}

}
