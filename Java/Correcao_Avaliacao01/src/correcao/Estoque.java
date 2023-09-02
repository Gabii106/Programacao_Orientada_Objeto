package correcao;

import java.util.Scanner;

/*
 * Utilizando os conceitos de encapsulamento, crie um programa para 
 * cadastro de produtos e gerenciamento de estoque.
 * O programa deve seguir as seguintes regras:
 * ok  -> Permitir que o usuário cadastre o nome, a descrição, o valor 
 *      e a quantidade de itens do produto em estoque.
 *   -> Não deve permitir que o usuário informe valores negativos para 
 *   	o campo referente ao valor do produto.
 *   -> Não deve permitir que seja cadastrado um valor negativo para a 
 *   	quantidade em estoque.
 *   -> Não deve permitir que sejam cadastrados produtos duplicados 
 *   	(com o mesmo nome).
 *   -> Deve solicitar as informações de um produto até que o usuário 
 *   	informe valores válidos.
 * ok  -> Deve cadastrar 20 produtos.
 *   -> Deve apresentar o cálculo do valor total de todos os produtos; - Errei
 *   -> Deve apresentar o valor médio dos produtos cadastrados;
 *   -> Deve apresentar a quantidade total de produtos em estoque;
 *   -> Deve apresentar os produtos que possuem quantidade em estoque 
 *   	menor ou igual a 5.
 *   -> Deve apresentar o valor total dos produtos que estão com   - Errei
 *   	estoque menor ou igual a 5;
 */

public class Estoque {

	static final int NumElementos = 5;
	static Produto[] Estoque = new Produto[NumElementos];
	static int ValorTotalProdutos;
	static int QuantidadeTotalProdutos;
	
	
	public static void main(String[] args) 
	{	
		Scanner   Leitor  = new Scanner(System.in);
		Boolean   RefazLoop;
		
		for ( int i = 0; i < NumElementos; i++ )
		{
			Estoque[i] = new Produto();
			
			RefazLoop = true;
			while (RefazLoop)
			{
				System.out.println("Informe o nome do produto " + i + ": ");
				RefazLoop = !Estoque[i].setNome(Leitor.nextLine());
				if (ProdutoComNomeRepetido(i))
				{
					System.out.println("Já existe um produto com este nome!");
					RefazLoop = true;
				}
			} 
			System.out.println("Informe a descrição do produto " + i + ": ");
			Estoque[i].setDescricao(Leitor.nextLine());
			
			
			RefazLoop = true;
			while (RefazLoop)
			{
				System.out.println("Informe o valor do produto " + i + ": ");
				RefazLoop = Estoque[i].setValor(Leitor.nextDouble());
			}
			
			RefazLoop = true;
			while (RefazLoop)
			{
				System.out.println("Informe a quantidade do produto " + i + " em estoque: ");
				RefazLoop = Estoque[i].setQuantidade(Leitor.nextInt());
			}
		}
		Leitor.close();
	}

	static private Boolean ProdutoComNomeRepetido(int ProdutoAtual)
	{
		Boolean NomeRepetido = false;

		for ( int i = 0; i < ProdutoAtual; i++ )
			if (Estoque[i].getNome().equals(Estoque[ProdutoAtual].getNome()))
			{
				NomeRepetido = true;
				break;
			}

		return NomeRepetido;
	}
	
	static private void RealizarCalculos() {
		QuantidadeTotalProdutos = 0;
		ValorTotalProdutos = 0;
		
		for(int i = 0; i < NumElementos; i++) {
			QuantidadeTotalProdutos += Estoque[i].getQuantidade();
			ValorTotalProdutos += (Estoque[i].getQuantidade() * Estoque[i].getValor()); 
		}
		
		
	}
}

