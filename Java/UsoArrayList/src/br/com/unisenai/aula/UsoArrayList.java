package br.com.unisenai.aula;

import java.util.ArrayList;

public class UsoArrayList {

	public static void main(String[] args) {
		
		//Criar e inicializar um ArrayList
		ArrayList<String> nomes = new ArrayList<>(); //Tipo que vai ser guardado na lista vai dentro dos <>
		
		//Método size - Retorna a quantidade de itens existentes na lista
		System.out.println("A lista contem "+nomes.size()+" itens.");
		
		//Adicionar um item na primeira posição disponivel
		nomes.add("João");
		
		System.out.println("A lista contem "+nomes.size()+" itens.");
		
		nomes.add("Maria");
		nomes.add("Fernanda");
		
		System.out.println("A lista contem "+nomes.size()+" itens.");
		
		//Mostrar o conteudo da lista
		System.out.println(nomes);
		
		//Método set - Altera o item da lista no indice informado
		nomes.set(2,"Juliana");
		System.out.println(nomes);
		
		//Método remove - Remove um item da lista no indice informado
		nomes.remove(0);
		System.out.println(nomes);
		
		//Método get - Retorna o item do indice informado
		String segundoItem = nomes.get(1);
		System.out.println(segundoItem);
		
		//System.out.println(nomes.get(5)); - Dá erro, pois o indice 5 não existe na lista - Index of bond
		
		
		//Object o1 = new Object(); //Duas variaveis que apontam para um endereço de memória e Um objeto que é referenciado por 2 variaveis
		//Object o2 = o1; //Duas referencias/variaveis para 1 objeto, o número de objetos é definido pelo new
		
		
		//String terceiroNome = null; - Não foi inicializada - logo não poder ser referencia de um objeto, metodo isBlank() é um metodo de objeto
		//System.out.println(terceiroNome.isBlank()); - Erro mais comum - NullPointerException
	}

}
