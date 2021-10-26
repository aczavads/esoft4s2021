package lista01.exercício06;

public class ContaCorrente {
	private double saldo;
	
	public void debitar(double valor) {
		saldo = saldo - valor;
	}
	
	public void creditar(double valor) {
		saldo = saldo + valor;
	}
	
	public double getSaldo() {
		return saldo;
	}

}
