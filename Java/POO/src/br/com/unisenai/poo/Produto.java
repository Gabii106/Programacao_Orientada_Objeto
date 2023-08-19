package br.com.unisenai.poo;

public class Produto { //Propriedades de um produto de e-comerce
	public int idProduto;
	public String nome;
	public double preco;
	public String tamanho;
	public String entrega;
	public String descricao;
	public double frete;
	public String avaliacao;
	public String cor;
}

class Cliente {
	public int idCliente;
	public String nomeCliente;
	public int numeroCartao;
	public String endereco;
	public String email;
	public String telefone;
}

class Pedido{
	public int numeroPedido;
	public Produto produto;
	public Cliente cliente;
	public String previsaoEntrega;
	public String status;
	public double custoFinal;
}
