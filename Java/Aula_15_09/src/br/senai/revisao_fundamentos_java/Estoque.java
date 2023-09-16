package br.senai.revisao_fundamentos_java;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Produto> itens = new ArrayList<>();
		Produto prod;
		prod = new Produto(123, "12345678987654", "Copo plástico",1.00, 100 ); //Tem referencias diferentes
		
		//prod.setCodigo(123);
		//prod.setEan("12345678987654");
		//prod.setNome("Copo plástico");
		//prod.setValor(1.00);
		//prod.setQtde(100);
		
		
		itens.add(prod);
		
		prod = new Produto(456, "Aguá"); //Tem referencias diferentes - Pois new dá uma nova referencia
		
		//prod.setCodigo(456);
		//prod.setEan("6543345678");
		//prod.setNome("Aguá");
		//prod.setValor(1.00);
		//prod.setQtde(100);
		
		itens.add(prod);
		
		prod = new Produto(); //Se apenas comentar todos os prods menos o primeiro e descomentar os sets- Todos os itens serão o ultimo - pq os itens salvos na lista são as referencias
		
		prod.setCodigo(789);
		prod.setEan("98765456789");
		prod.setNome("Café");
		prod.setValor(1.00);
		prod.setQtde(100);
		
		
		itens.add(prod);
		System.out.println(itens.get(0).toString());
		System.out.println(itens.get(1).toString());
		System.out.println(itens.get(2).toString());
		
		sc.close();
	}

}
