package br.com.unisenai.aula;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContactv1 {

	public static void main(String[] args) {
		int max = 5;
		Scanner sc = new Scanner(System.in);
		ArrayList<Contact> contactList = new ArrayList<>();
		
		System.out.println("#####################");
		System.out.println("Cadastro de Contatos");
		System.out.println("#####################");
		
		for(int index = 0; index < max; index++) {
			Contact currentContact = new Contact();
			System.out.println("Informe o nome do contato ("+(index+1)+"/"+max+") ");
			currentContact.setName(sc.next());
			System.out.println("Informe o email do contato ("+(index+1)+"/"+max+") ");
			currentContact.setEmail(sc.next());
			System.out.println("Informe o telefone do contato ("+(index+1)+"/"+max+") ");
			currentContact.setPhone(sc.next());
			
			contactList.add(currentContact);
		}
		
		System.out.println("Os contatos cadrastrados foram...");
		
		for(int index = 0; index < contactList.size(); index++) {
			Contact contact = contactList.get(index);
			System.out.println(contact.getName()+", "+contact.getPhone()+", "+contact.getEmail());
			
		}
		
		sc.close();

	}

}
