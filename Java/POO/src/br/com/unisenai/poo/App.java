package br.com.unisenai.poo;

public class App {

	public static void main(String[] args) {
		Contato contato1 = new Contato(); //Instancia a classe contato 
		// Contando é um tipo customizado e não um objeto 
		// contato1 é uma variavel
		//new Contato() constroi o objeto - é o construtor
		// antes do = é declarar a referencia do objeto e dps do = é inicializar o objeto na memória, para isso é necessário chamar o construtor
		//Quando chamo o construtor cria objeto na memória
		//Construtor olha as propriedades que tem e cria espaço na memória para elas
		
		//Instanciar = criar um instancia (execução) de um objeto
 	
		
		//Atribui valores a um atributo
		contato1.nome = "Gabi"; //referencia.propriedadeADefinir
		contato1.telefone = "12345678";
		contato1.email = "algo@email.com";
		
		//Chama métodos
		contato1.telefonar();
		contato1.enviarEmail("Seu cadastro foi aprovado. Aguardamos vc na segunda feira!");
		
		Contato contato2 = new Contato();
		
		contato2.nome = "NãoSei";
		contato2.telefone = "75368092";
		contato2.email = "NãoSei@email.com";
		
		contato2.telefonar(); //Utilizar metódo de instancia
		contato2.enviarEmail("Seu cadastro não foi aprovado. Lamento!");
		
		//Quando o App estiver rodando ele vai criar um objeto na memória
		//Objeto é sempre em memória
		
		}
}
