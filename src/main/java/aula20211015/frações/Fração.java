package aula20211015.frações;

public class Fração {
	private int numerador;
	private int denominador;
	
	public Fração(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;		
	}
	
	public double asDouble() {
		return ((double)numerador) / denominador;
	}
	
	public String toString() {
		return numerador + "/" + denominador;
	}
	
	public Fração inverter() {
		Fração inversa = new Fração(denominador, numerador);
		return inversa;
	}
	public Fração multiplicarPor(Fração outra) {
		Fração resultante = new Fração(
				this.numerador * outra.numerador,
				this.denominador * outra.denominador);
		return resultante;
	}
	public Fração dividirPor(Fração outra) {
		Fração resultante = this.multiplicarPor(outra.inverter());
		
		return resultante;
	}
}


