package br.com.tutorialjdbc;

public class InsertTest {

	public static void main(String[] args) {
		
		ContactRepository repository = new ContactRepository();
		
		Contact contact = repository.insert("Ana", "ana@senai.com", "33225599");
		
		System.out.println("O contato inserido foi: ");
		System.out.println(contact);
	}

}
