package br.senai.revisao;

import java.util.Iterator;

public class RevisaoParte2 {

	public static void main(String[] args) {
		//Conversão de tipos
		
			//Integer.parseInt
			//Double.parseDouble
			//String.valueOf
			
			//Converter texto para inteiro 
		
			System.out.println("Conversão de tipos: ");
		
			int numero = Integer.parseInt("2"); //Tem que ser valor numerico (em algarismos) dentro das ""
			double py = Double.parseDouble("3.1415");
			long mt = Long.parseLong("12345678910");
			byte a = Byte.parseByte("127");
			short b = Short.parseShort("32");
			float c = Float.parseFloat("1.13");
			
			int x = 3;
			Integer bla = x; //Integer bla = new Integer(x);
			int zeb = bla; // bla.intValue();
			
			int n1 = 10;
			float f1 = n1;
			System.out.println("f1 = "+f1);
			
			float f2 = 10.1234567f; //f no final é de flutuante, por que se não colocar o computador entende como double
			int n2 = (int) f2; //pega só a parte inteira, independente do valor da decimal
			System.out.println("n2 = "+n2);
			
			byte b5 = (byte) 150; //entre () é o cast, ele força a ser aquela tipagem entre numeros
			System.out.println("b5 = "+b5);// -128 até 127; 150 - 127 = 23; -128 + 23 = -105; e adiciona +1 por conta do zero, que conta como um valor; = -106;
			
			String value = String.valueOf(b5);
			System.out.println("value = "+value);
			
			
		//Instrução switch/case
			
			//n2 = 1;
			
			//Não importa a ordem 
			//Normalmente as instruções terminam com break, por que sem ele continua a partir do primeiro case que cumpre a condição, mesmo se o resto não atender 
			
			System.out.println("\nSwitch: ");
			
			switch (n2) {
			case 4:
				System.out.println("Número é 4");
				break;
			case 1: 
				System.out.println("Número é 1");
				break;
			default:
				System.out.println("Número diferente de 1, 2, 3 e 4");
				break;
			case 3:
				System.out.println("Número é 3");
				break;
			case 2:
				System.out.println("Número é 2");
				break;
			}
			
			
		//Instrução while
			
			//Da para usar break para quebrar o laço
			//continue, volta para o começo do laço
			
			System.out.println("\nWhile com break: ");
			
			int p = 1;
			while (p <= 10) {
				if(p > 5) {
					break;
				}
				System.out.print(p+" ");
				p++;
			}
			
			System.out.println("\n p = "+p);
			
			System.out.println("\nWhile com continue: ");
			
			 p = 1;
			while (p <= 10) {
				p++;
				if(p > 5) {
					continue;
				}
				System.out.print(p+" ");
			}
			
			System.out.println("\n p = "+p);
			
			int x10 = 1;
			
			System.out.println("\nWhile sem chaves: ");
			
			while(x10 <5) // mesma coisa que o if
				System.out.print((x10++)+" ");
				System.out.println("Oi");
			
		
		//Intrução for
			
			System.out.println("\nFor:");
			
			for (int index = 1; index <= 10; index++) {// for (1 - Bloco de inicialização; 2 - Bloco de comparação; 4 - Bloco de incremento ou pós execuçaõ)
				System.out.print(index+" "); // 3 - Corpo
				//Inicializa(só acontece na primeira vez), compara, executa o corpo, incrementa, compara, executa o corpo, incrementa, compara, executa o corpo, incrementa... (até a comparação for falsa)
				//Inicialização é opcional, da para deixar fora
			}
			
			//Inicialização é opcional, da para deixar fora
			//incremento tbm, da para executar dentro do corpo/
			//comparação tbm, mas dai vira um laço infinito
			
			System.out.println("\n\nOutro for:");
			
			int index2 = 1;
			
			for(; index2 <= 10;) {
				System.out.print(index2+" ");
				index2++;
			}
			
			System.out.println("\n\nFor sem chaves:");
			
			for (int index = 100; index <= 110; index++) //for sem {} funciona da mesma forma que o if
				System.out.print(index+" ");
				System.out.println("Oi");		

	}

}
