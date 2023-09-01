package prova;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) { //export - archive file - mandar um zip
		Scanner in = new Scanner(System.in);
		
		Produto registros[] = new Produto[4];
		String nomes[] = new String[20];
		
		double valorTotal = 0;
		int estoqueTotal = 0;
		double valorEstoqueMenorIgual5 = 0;
		String produtosEstoqueMenorIgual5 = "";
		int cont = 0;
		int tot = 0;
		String aux = "";
		
		for(int i = 0; i < registros.length; i++) {
			Produto produto = new Produto();
			
			while(produto.getNome().equals("")) {
				tot = 0;
				System.out.println("Informe o nome do produto: ");
				 aux = in.nextLine();
				
				if(cont > 0) {
					for(int d = (cont-1); d >= 0; d--) {
						if(aux.equals(nomes[d])) {
							tot++;
						}
					}
				}
				
				if(tot == 0) {
					produto.setNome(aux);
					nomes[cont] = aux;
					cont++;
				} else {
					System.out.println("Já existe um produto com esse nome!");
				}
				
			}
			
			System.out.println("Informe a descrição do produto: ");
			produto.setDescricao(in.nextLine());
			
			
			while(produto.getValor() < 0) {
				System.out.println("Informe o preço do produto: ");
				produto.setValor(Double.parseDouble(in.nextLine()));
			}
			
			while(produto.getEstoque() < 0) {
				System.out.println("Informe a quantidade de itens do produto em estoque: ");
				produto.setEstoque(Integer.parseInt(in.nextLine()));
			}
			
			registros[i] = produto;
		}
		
		
		for(int a = 0; a < registros.length; a++) {
			Produto pA = registros[a];
			valorTotal += pA.getValor();
			estoqueTotal += pA.getEstoque();
			
			if(pA.getEstoque() <= 5) {
				valorEstoqueMenorIgual5 += pA.getValor();
				produtosEstoqueMenorIgual5 += "Nome: "+pA.getNome()+", Descrição: "+pA.getDescricao()+", Preço: "+pA.getValor()+", Quantidade em estoque: "+pA.getEstoque()+"\n";
			}
		}
		
		double valorMedio = valorTotal / registros.length;
		
		System.out.println("Valor total dos produtos cadastrados: "+valorTotal);
		System.out.println("Estoque total dos produtos cadastrados: "+estoqueTotal);
		System.out.println("Média total dos produtos cadastrados: "+valorMedio);
		
		System.out.println("Produtos com quantidade de estoque de 5 ou menos: ");
		System.out.println(produtosEstoqueMenorIgual5);
		System.out.println("Valor total dos produtos com estoque menor ou igual a 5: "+valorEstoqueMenorIgual5);
		
		in.close();

	}
	


}
