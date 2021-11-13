package aula20211112.polimorfismo.bancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AppBancoDeDados {

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:h2:~/esoft4s2021","sa","");
			//Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/esoft4s2021","professor","professor");
			
			conn.createStatement().execute("create table if not exists produto ("
					+ "id integer not null primary key, "
					+ "nome varchar(255) not null unique"
					+ ")");
			
			try {
				PreparedStatement psInsert = conn.prepareStatement("insert into produto (id, nome) values (?,?)");
				psInsert.setInt(1, 199);
				psInsert.setString(2, "Produto Cento e Noventa e Nove");
				psInsert.execute();
				psInsert.close();				
			} catch (Exception e) {
				System.out.println("Opa, acho que duplicou: " + e.getMessage() );
			}
			
			PreparedStatement psSelect = conn.prepareStatement("select id, nome from produto where id = ?");
			psSelect.setInt(1, 199);
			ResultSet rsSelect = psSelect.executeQuery();
			while (rsSelect.next()) {
				System.out.println(" nome do produto >>> " + rsSelect.getString("nome"));
			}
			rsSelect.close();
			psSelect.close();
			
			System.out.println("Foi");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("Olha a abstração aqui gente!");
			System.out.println(conn.getClass());
			System.out.println(psSelect.getClass());
			System.out.println(rsSelect.getClass());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
