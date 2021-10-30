package lista01.exercício07;

public class Rodado {
	private int pressão;
	private Pneu pneu;

	public Rodado(Pneu pneu) {
		this.pneu = pneu;
	}

	public void calibrar(int pressão) {
		this.pressão = pressão;
	}

	public int getPressão() {
		return this.pressão;
	}

}
