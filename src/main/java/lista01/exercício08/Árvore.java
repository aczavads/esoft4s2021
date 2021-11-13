package lista01.exercício08;

public class Árvore {
	private double altura;
	private Espécie espécie;
	
	public Árvore(Espécie espécie, double altura) {
		this.espécie = espécie;
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	public Espécie getEspécie() {
		return espécie;
	}

	@Override
	public String toString() {
		return "Árvore [altura=" + altura + ", espécie=" + espécie + "]";
	}
	
	
	
	

}
