package br.com.unisenai.historiaDeUsuario;

import java.util.ArrayList;
import java.util.Scanner;

public class CartaoView { //Classe responsavel pela parte de interação com o usuario
	private CadastroCartao controlador = new CadastroCartao();
	private Scanner leitor;
	
	public CartaoView(Scanner leitor) {
		this.leitor = leitor;
	}
	
	public void menu() {
		int opcao = 0;
		while(opcao != 5) {
		System.out.println("-----Menu-----");
		System.out.println("1 - Cadrastrar cartão");
		System.out.println("2 - Listar todos os cartões");
		System.out.println("3 - Listar cartão por numero");
		System.out.println("4 - Listar cartão por palavra/frase em inglês");
		System.out.println("5 - Sair");
		System.out.println("Informe a opção escolhida: ");
		opcao = leitor.nextInt();
		tratarOpcao(opcao);
		}
	}
	
	public void tratarOpcao(int opcao) {
		switch(opcao) {
		case 1:
			cadatrarCartao();
			break;
		case 2:
			listarTodos();
			break;
		case 3:
			listarPorNumero();
			break;
		case 4:
			listarPorFrase();
			break;
		case 5:
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
	}
	
	public void cadatrarCartao() {
		System.out.println("-----Cadastrar cartão-----");
		System.out.println("Informe o número do cartão: ");
		int num = leitor.nextInt();
		System.out.println("Informe a palavra/frase em inglês: ");
		String ingles = leitor.nextLine();
		while(ingles.equals("") || ingles.equals(null)) {
			System.out.println("Palavra/Frase não informada! Informe a palavra/frase: ");
			ingles = leitor.nextLine();
		}
		System.out.println("Informe sua tradução: ");
		String trad = leitor.nextLine();
		while(trad.equals("") || trad.equals(null)) {
			System.out.println("Tradução não informada! Informe a tradução: ");
			trad = leitor.nextLine();
		}
		
		controlador.cadastrar(num, ingles, trad); //Pega cadastrar da classe CadastroCartao
	}
	
	public void listarTodos() {
		System.out.println("-----Listar todos-----");
		listar(controlador.buscarTodos());
	}
	
	public void listar(ArrayList<Cartao> cartoes) {
		for (Cartao cartao : cartoes) {
			StringBuilder builder = new StringBuilder();
			builder
			.append("Número do cartão: ").append(cartao.getNumeroCartao()).append(" ")
			.append("Palavra/Frase em inglês: ").append(cartao.getFraseIngles()).append(" ")
			.append("Tradução: ").append(cartao.getTraducao()).append(" ");
			System.out.println(builder.toString());
		}
	}
	
	public void listarPorNumero() {
		System.out.println("-----Listar por numero-----");
		System.out.println("Informe o número escolhido: ");
		int numero = leitor.nextInt();
		listar(controlador.buscarPorNumero(numero));
	}
	
	public void listarPorFrase() {
		System.out.println("-----Listar por palavra/frase em inglês-----");
		System.out.println("Informe a palavra/frase em inglês escolhida: ");
		String ing = leitor.nextLine();
		ing = leitor.nextLine();
		listar(controlador.buscarPorFrase(ing));
	}
}
