package lista01.exercício06;

public class AppExercício06 {
	
	public static void main(String[] args) {
		ContaCorrente bancoItaú5574 = new ContaCorrente();
		bancoItaú5574.debitar(100);
		bancoItaú5574.debitar(100);
		bancoItaú5574.debitar(200);
		bancoItaú5574.creditar(300);
		bancoItaú5574.creditar(400);
		bancoItaú5574.debitar(20);
		
		System.out.println("Saldo da conta Itaú 5574: " + bancoItaú5574.getSaldo());

		
	}

}
