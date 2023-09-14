package br.com.unisenai.aula;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroDog {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Dog> dogsList = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			Dog cao = new Dog();
			
			System.out.println("Informe o nome do "+(i+1)+"° cachorro: ");
			cao.setName(in.next());
			System.out.println("Informe a idade do "+(i+1)+"° cachorro: ");
			cao.setAge(in.nextInt());
			
			dogsList.add(cao);
		}
		
		System.out.println("Cachorros cadastrados: ");
		for(int i = 0; i < 5; i++) {
			Dog cachorro = dogsList.get(i);
			
			System.out.println(cachorro.getName()+", com "+cachorro.getAge()+" anos");
		}
		
		in.close();
	}

}
