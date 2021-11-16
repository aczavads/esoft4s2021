package aula20211116.blocoDeExceções;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppBlocoDeExceções {
	
	public static void main(String[] args) /*throws SQLException*/ {
		//isso é um try with resources, cujo objetivo é chamar o close() de qualquer
		//tipo que implemente AutoCloseable, que é o caso de nossa Connection.
		try (Connection conn = DriverManager.getConnection("jdbc:h2:~/esoft4s2021","sa",""); 
		     Cofre c = new Cofre();) {
			conn.prepareStatement("Batatinha quando nasce... :D");
		} catch (Exception e) {
			System.out.println("Opa, gerou uma SQLException! " + e.getMessage());
		} 	
		System.out.println("Foi.");
		
	}

	
	
	public static void main_com_finally(String[] args) /*throws SQLException*/ {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:h2:~/esoft4s2021","sa","");
			conn.prepareStatement("Batatinha quando nasce... :D");
		} catch (SQLException e) {
			System.out.println("Opa, gerou uma SQLException! " + e.getMessage());
		} finally {
			try {
				conn.close();				
			} catch (Exception e2) {
			}
			System.out.println("Conexão fechada!");
			System.out.println("Sempre passará no finally!  :D");
		}		
		System.out.println("Foi.");
		
	}
	


}
