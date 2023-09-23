package br.com.unisenai.historiaDeUsuario;

import java.util.ArrayList;

public class CadastroCartao { //Responsável pelo cadastro e para a parte de listar
	//Esse é o controller
	private RepositorioCartao repositorio = new RepositorioCartao(); //Intancia a classe RepositorioCartao - Pode usar os metódos dela

	public void cadastrar(int numeroCartao,String fraseIngles, String traducao) {
		Cartao cartao = new Cartao(numeroCartao, fraseIngles, traducao);
		repositorio.inserir(cartao);
	}
	
	public ArrayList<Cartao> buscarTodos(){
		return repositorio.listar();
	}
	
	public ArrayList<Cartao> buscarPorNumero(int num){
		return repositorio.listarPorNumero(num);
	}
	
	public ArrayList<Cartao> buscarPorFrase(String frase){
		return repositorio.listarPorFrase(frase);
	}
}
