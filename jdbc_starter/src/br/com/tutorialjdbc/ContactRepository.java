package br.com.tutorialjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ContactRepository {
	//Colunas da tabela
	private static final String COL_ID = "id";
	private static final String COL_NAME = "name";
	private static final String COL_EMAIL = "email";
	private static final String COL_PHONE = "phone";

	public List<Contact> findAll() { 
		List<Contact> records = new ArrayList<>();
		String sql = "select * from contacts"; //Comando que vai ser executado
		try {
			Connection db = Database.getConnection(); //Cria uma coneccao
			PreparedStatement preparedStatement = db.prepareStatement(sql); //Previne comandos de sql injection - Se proteger contra sql injection
			ResultSet resultSet = preparedStatement.executeQuery(); //Executa o select no banco - Traz um ResultSet, que são os resultados trazidos do select
			while (resultSet.next()) {
				records.add(fromResultSet(resultSet)); //Adiciona na lista o resultado da funcao
			}
			resultSet.close();
			preparedStatement.close();
			db.close();
		} catch (SQLException e) {
			throw new RuntimeException("Não foi possível executar a operação no banco de dados");
		}
		return records;
	}

	private Contact fromResultSet(ResultSet resultSet) throws SQLException { //Le as colunas que montam o contato
		Integer id = resultSet.getInt(COL_ID); //Pega o valor que esta na coluna id
		String name = resultSet.getString(COL_NAME);
		String email = resultSet.getString(COL_EMAIL);
		String phone = resultSet.getString(COL_PHONE);
		return new Contact(id, name, email, phone); //Cria novo contato para armazenar
	}
	
	public Contact insert(String name, String email, String phone) { //Inserir um novo Contact
		//Basico = comando sql, try coneccao com o banco
		String sql = "insert into contacts(name, email, phone) values (?, ?, ?)";
		Contact contact = null;
		
		try {
			Connection db = Database.getConnection();
			PreparedStatement preparedStatement = db.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //Retorna as chaves geradas pelo banco, no caso o id
			preparedStatement.setString(1, name); //Inserem o valor nas ? - Essa é do primeiro parametro
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, phone);
			
			preparedStatement.execute(); //Execute - pois não retorna um resultSet - retorna um booleano para ver se funcionou ou não
			
			ResultSet resultSet = preparedStatement.getGeneratedKeys();
			if(resultSet.next()) { //if se é para 1, while se é para mais - e só naqueles que retornam algo
				Integer id = resultSet.getInt("id");
				contact = new Contact(id, name, email, phone);
			}
			resultSet.close();
			preparedStatement.close();
			db.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possível inserir o registro");
		}
		return contact;
	}
	
	public void update(Contact contact) {
		String sql = "update contacts set name = ?, email = ?, phone = ? where id = ?";
		
		try {
			Connection db = Database.getConnection();
			PreparedStatement preparedStatement = db.prepareStatement(sql);
			preparedStatement.setString(1, contact.getName()); //É de acordo com a ordem das ? 
			preparedStatement.setString(2, contact.getEmail()); 
			preparedStatement.setString(3, contact.getPhone()); 
			preparedStatement.setInt(4, contact.getId()); 
			
			preparedStatement.executeUpdate(); //Retorna quantidade de elementos atualizados/removidos
			preparedStatement.close();
			db.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possível atualizar o registro");
		}
		
	}
	
	public Contact findById(Integer id) {
		Contact contact = null;
		String sql = "select * from contacts where id = ?";
		
		try {
			Connection db = Database.getConnection();
			PreparedStatement preparedStatement = db.prepareStatement(sql); //Prepara para executar o comando no BD
			preparedStatement.setInt(1, id); 
			ResultSet resultSet = preparedStatement.executeQuery(); //Execulta e pega o resultado do select 
			if(resultSet.next()) {
				contact = fromResultSet(resultSet);
			}
			
			resultSet.close();
			preparedStatement.close();
			db.close();
		} catch (SQLException e) {
			throw new RuntimeException("Não foi possível executar a operação no banco de dados");
		}
		return contact;
	}
	
	
	public void delete(Integer id) {
		String sql = "delete from contacts where id = ?";
		
		try {
			Connection db = Database.getConnection();
			PreparedStatement preparedStatement = db.prepareStatement(sql);
			preparedStatement.setInt(1, id); 
			
			preparedStatement.executeUpdate(); //serve para update e delete
			preparedStatement.close();
			db.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possível remover o registro");
		}
	}
	
	public List<Contact> findByName(String name){
		List<Contact> records = new ArrayList<>();
		String sql = "select * from contacts where name like ?";
		
		try {
			Connection db = Database.getConnection();
			PreparedStatement preparedStatement = db.prepareStatement(sql); 
			preparedStatement.setString(1, name+"%"); 
			ResultSet resultSet = preparedStatement.executeQuery();  
			while(resultSet.next()) {
				records.add(fromResultSet(resultSet));
			}
			
			resultSet.close();
			preparedStatement.close();
			db.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Não foi possível executar a operação no banco de dados");
		}
		
		return records;
	}
	
}