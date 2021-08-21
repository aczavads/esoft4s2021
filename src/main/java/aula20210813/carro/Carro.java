package aula20210813.carro;

public class Carro {
	private boolean ligado = false;
	private int capacidadeDoTanqueEmLitros;
	private int volumeNoTanqueEmLitros;
	
	public Carro(int capacidadeDoTanqueEmLitros) {
		this.capacidadeDoTanqueEmLitros = capacidadeDoTanqueEmLitros;
	}
	
	public void abastecer(int volumeAdicionalEmLitros) {
		if ((volumeNoTanqueEmLitros + volumeAdicionalEmLitros) > capacidadeDoTanqueEmLitros) {
			throw new RuntimeException("Volume excedido!");
		}
		volumeNoTanqueEmLitros = volumeNoTanqueEmLitros + volumeAdicionalEmLitros;
	}
	
	public void ligar() {
		if (nãoTemCombustível()) {
			throw new RuntimeException("Sem combustível!");
		}
		volumeNoTanqueEmLitros -= 1;
		if (estáLigado()) {
			throw new RuntimeException("Não pode ligar carro já ligado!!!");
		}
		ligado = true;
	}

	private boolean estáLigado() {
		return ligado;
	}

	private boolean nãoTemCombustível() {
		return volumeNoTanqueEmLitros == 0;
	}
	
	public void desligar() {
		if (!estáLigado()) {
			throw new RuntimeException("Não pode desligar carro já desligado!!!");
		}
		ligado = false;
	}
}
