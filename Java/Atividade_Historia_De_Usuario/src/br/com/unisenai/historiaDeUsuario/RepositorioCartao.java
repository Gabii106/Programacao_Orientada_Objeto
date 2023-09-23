package br.com.unisenai.historiaDeUsuario;

import java.util.ArrayList;

public class RepositorioCartao { //Responsavel por armazenar as informações - Normalmente tem conexção com o banco de dados 
	
	public static ArrayList<Cartao> cartoes = new ArrayList<>(); //Cria uma lista dinamica de Cartao
	
	public void inserir(Cartao cartao) {
		cartoes.add(cartao);
	}
	
	public ArrayList<Cartao> listar(){
		return cartoes;
	}
	
	public ArrayList<Cartao> listarPorNumero(int numeroEscolhido){
		ArrayList<Cartao> filtrados = new ArrayList<>();
		for (Cartao cartao : cartoes) {
			if (numeroEscolhido == cartao.getNumeroCartao()) {
				filtrados.add(cartao);
			}
		}
		return filtrados;
	}
	
	public ArrayList<Cartao> listarPorFrase(String fraseEscolhida){
		ArrayList<Cartao> filtrados = new ArrayList<>();
		for(Cartao cartao : cartoes) {
			if(fraseEscolhida.equalsIgnoreCase(cartao.getFraseIngles())) {
				filtrados.add(cartao);
			}
		}
		return filtrados;
	}


}
