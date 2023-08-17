package br.senai.revisao;

import java.util.Scanner;

public class Hello {
	
	/**Inicialização
	 * de
	 * aplicação/documentação
	 * Olhar main 
	 * JavaDoc
	 * @param parametro
	 * @author Aluna*/

	public static void main(String[] args) {
		//Main é o ponto de entrada, e ele é chamado pela JVM
		System.out.println("Olá outra vez!!!");
		
		//Revisão:
		
		//Declaração, iniciação e utilização de variáveis
			//tipo identificador = valor;
		
		String curso = "Orientação a Objetos";
		
		Integer numero;
		numero = 10;
		
		//Tipos de dados
		
			//Primitivos: byte, short, char, int, long, flout, double e boolean - armazenados diretamente na memória (stack)
		
			//Objetos: String - armazenados na memória heap, o que fica na memoria mesmo é o endereço do heap - por conta da sua estrutura complexa
		
		int n1=1;
		int n2=1;
		
		System.out.println(n1 == n2); //Comparação - aparece true ou false
		
		String nome1 = new String("Ana");
		String nome2 = new String("Ana");
		
		System.out.println(nome1 == nome2);
		System.out.println(nome1.equals(nome2));
		
		//Apresentação de dados
		
		System.out.println("Apresentar mensagem");
		
		//Leitura de dados
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informa sua idade: ");
		int idade = Integer.parseInt(leitor.nextLine());
		System.out.println("Sua idade daqui a 20 anos será "+(idade + 20));
		leitor.close();
		
		//Conversão entre tipos
		
		//Operadores matemáticos
			//Ordem: * / % + -
		
		int nx1 = 5, nx2 = 10;
		
		System.out.println(nx1 * nx2);
		System.out.println(nx1 / nx2);
		System.out.println(nx1 % nx2);
		System.out.println(nx1 + nx2);
		System.out.println(nx1 - nx2);
		
		double x = 10, y = 0;
		System.out.println(x / y);

		
		//Operadores compostos
			// += -= *= /=
		
		int p = 10;
		p *= 5 + 2; //p = p * (5 + 2)
		System.out.println("p = " +p);

		//Operadores de comparação
			// >= > <= < != == 
		
		System.out.println('c' >= 65); //é true por conta da tabela ascii, c é 99 nessa tabela
		System.out.println((int)'c');
		
		//Operadores lógicos
			//E && OU || NÃO ! XOR ^
			//São operadores de curto circuito - se a condiçaõ ja estiver correta na primeira, ele nem olha a segunda
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(true || true);
		System.out.println(true ^ false); //Só um pode ser verdeiro  
		System.out.println(true ^ true);
		System.out.println(!false); //Inverte o valor
		System.out.println(!true);
		
		//Instrução if/else
		
		if(5 > 2 && 3 < -4) {
			System.out.println("Comando 1");
			System.out.println("Comando 2");
		} else if('a'=='b') {
			System.out.println("a é igual b");
		} else {
			System.out.println("if é falso, então, executa else");
		}
		
		if(1 > 5)
			System.out.println("Comando 1"); //Sem chaves, só executa o primeiro comando
			System.out.println("Comando 2");

		
		//Instrução switch/case
		
		//Operadores ternário
		
		int idade2 = 18;
		String mensagem2 = idade2 >= 18 ? "Maior" : "Menor";  // true : false
		//Da para usar equals ou true/false na condição
		System.out.println(mensagem2);
		
		//Operadores unário
		
		int az = 10;
		int result = az++; // é assim pq primeiro passa o valor para a variavel, e só dps incrementa
		
		// se for ++az, result = 11 e az = 11, 
		
		System.out.println("result = "+ result);
		System.out.println("az = "+az);
		
		int c =10;
		
		System.out.println("c++ = "+(c++));
		System.out.println("c = "+c);
		System.out.println("++c = "+(++c));
		System.out.println("c = "+c);
		
		/*Comentario
		 * de
		  varias (Indiferente se ter * na frente ou não)
		 * linhas*/
		
		
	}

}
