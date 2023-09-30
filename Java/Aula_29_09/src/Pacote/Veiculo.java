package Pacote;

public class Veiculo {

	static int codigo = 0;
	
	private String tipo;
	private String modelo;
	private String ano;
	private String combustivel;
	private int id;
	
	public Veiculo(String tipo, String modelo, String ano, String combustivel) {
		codigo++;
		
		setId(codigo);
		setTipo(tipo);
		setModelo(modelo);
		setAno(ano);
		setCombustivel(combustivel);
	}
	
	static public int numeroDeVeiculosCadastrados() {
		return codigo;
		//Dentro de um método estático só se usa variaveis estaticas
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public String getAno() {
		return this.ano;
	}
	
	public String getCombustivel() {
		return this.combustivel;
	}
	
	public int getId() {
		return this.id;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	
	public String toString() {
		return codigo + " - " + this.id+ " - " + this.tipo+ " - " + this.modelo+ " - " + this.ano+ " - " + this.combustivel;
	} //Em variavel static é desnesessario botar this
	
	
	

}
