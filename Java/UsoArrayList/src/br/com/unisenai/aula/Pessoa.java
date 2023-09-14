package br.com.unisenai.aula;

public class Pessoa {
	public String nome;
	public int idade;
	//protected String apelido = "mano"; //protected - Só em mesmo pacote ou uma classe que estende a classe Pessoa
	
	//construtor sem parametros é sempre chamado
	private Pessoa() { //O construtor é chamado quando o objeto é iniciado
		super(); //Construtor da super classe/classe pai - Vai ser importante em herança
		System.out.println("Chamou o construtor");
		nome = "Nome Padrão";
	}
	
	Pessoa(int idadeInicial) { //Sem nada em visibilidade  - nivel de pacote
		this(); //Referencia do objeto - Chama o construtor do objeto, ou seja, chama o outro construtor - Se tiver parametros, ele chama o construtor com parametros
		idade = idadeInicial;
	}
	
	public Pessoa(String nomeInicial, int idadeInicial) {
		nome = nomeInicial;
		idade = idadeInicial;
	}
}
