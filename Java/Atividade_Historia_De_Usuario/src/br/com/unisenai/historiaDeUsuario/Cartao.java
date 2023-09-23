package br.com.unisenai.historiaDeUsuario;

public class Cartao { //Essa é a entidade - ela é a classe domain - Não pode depender de nenhuma outra classe 
	private int numeroCartao;
	private String fraseIngles;
	private String traducao;
	
	public Cartao() {
		
	}
	
	public Cartao(int num, String frase, String trad) {
		this.numeroCartao = num;
		this.fraseIngles = frase;
		this.traducao = trad;
	}

	public int getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getFraseIngles() {
		return fraseIngles;
	}

	public void setFraseIngles(String fraseIngles) {
		this.fraseIngles = fraseIngles;
	}

	public String getTraducao() {
		return traducao;
	}

	public void setTraducao(String traducao) {
		this.traducao = traducao;
	}
	
	

}
