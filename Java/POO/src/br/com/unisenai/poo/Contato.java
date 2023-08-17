package br.com.unisenai.poo;

public class Contato {
	//Definições de propriedade - Fora de qualquer metódo, só assim é um atributo
	//Declaração das propriedades
	String nome;
	String telefone;
	String email;
	
	//Definições de comportamento - Declaração de Metodos
	public void telefonar() { 
		System.out.println("Telefonado para o número "+nome+" no número "+telefone);
	}
	
	public void enviarEmail(String mensagem) { //Quando o método for chamado ele vai executar o que está dentro das chaves
		System.out.println("Enviando a mensagem ");
		System.out.println(mensagem);
		System.out.println("Para o email "+email);
	}

}
