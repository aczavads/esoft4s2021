package aula20211112.polimorfismo.bancoDeDadosOrganizado;

import java.sql.Connection;
import java.sql.DriverManager;

public class AppBancoDeDadosOrganizado {
	
	public static void main(String[] args) {
		try {
			//Connection conn = DriverManager.getConnection("jdbc:h2:~/esoft4s2021","sa","");
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/esoft4s2021","professor","professor");
			
			ProdutoRepository repo = new ProdutoRepository(conn);
			
			try {
				repo.incluir(new Produto(123,"Produto 123"));
				repo.incluir(new Produto(124,"Produto 124"));				
			} catch (Exception e) {
				System.out.println("Duplicados... " +  e.getMessage());
			}
			
			
			System.out.println(repo.encontrarPeloId(123));
			
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
