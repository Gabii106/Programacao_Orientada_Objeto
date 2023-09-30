package Pacote;

import java.util.ArrayList;
import java.util.Scanner;

public class Frota {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		
		ArrayList<Veiculo> carros = new ArrayList<>();
		Veiculo carro;
		
		
		System.out.println(Veiculo.numeroDeVeiculosCadastrados()); //Se for static
		
		carro = new Veiculo("SUV", "TrailBlazer", "2010", "Diesel");
		carros.add(carro);
		
		System.out.println(Veiculo.numeroDeVeiculosCadastrados());
		
		carro = new Veiculo("Sedan", "Panamera", "2023", "Gasolina");
		carros.add(carro);
		
		System.out.println(Veiculo.numeroDeVeiculosCadastrados());
		
		carro = new Veiculo("Hatch", "Astra", "2008", "Gás");
		carros.add(carro); 
		
		System.out.println(Veiculo.numeroDeVeiculosCadastrados());
		
		carro = new Veiculo("Hatch", "Gol BX", "1986", "Alcool");
		carros.add(carro); 
		
		System.out.println(Veiculo.numeroDeVeiculosCadastrados());
		
		carro = new Veiculo("Caminhão", "Scania 1113", "1972", "Diesel");
		carros.add(carro); 
		
		System.out.println(Veiculo.numeroDeVeiculosCadastrados());
		
		for(Veiculo car : carros) { //for(TipoDaVariavel Apelido : NomeArray)
			System.out.println(car.toString());
		}
		
		kbd.close();
		
		//3 - SUV - TrailBlazer - 2010 - Diesel
		//3 - Sedan - Panamera - 2023 - Gasolina
		//3 - Hatch - Astra - 2008 - Gás
		// Todos são 3 pq a variavel é estática

	}

}
