package lista01.exercício07;

public class Veículo {

	private Rodado dianteiraDireita;
	private Rodado dianteiraEsquerda;
	private Rodado traseiraDireita;
	private Rodado traseiraEsquerda;
	private Rodado estepe;

	public void instalarRodadoDianteiraDireita(Rodado rodado) {
		this.dianteiraDireita = rodado;
	}

	public void instalarRodadoDianteiraEsquerda(Rodado rodado) {
		this.dianteiraEsquerda = rodado;
	}

	public void instalarRodadoTraseiraDireita(Rodado rodado) {
		this.traseiraDireita = rodado;
	}

	public void instalarRodadoTraseiraEsquerda(Rodado rodado) {
		this.traseiraEsquerda = rodado;
	}

	public void instalarRodadoEstepe(Rodado rodado) {
		this.estepe = rodado;
	}

	public Rodado getRodadoDianteiraDireita() {
		return dianteiraDireita;
	}

	public Rodado getRodadoDianteiraEsquerda() {
		return dianteiraEsquerda;
	}

	public Rodado getRodadoEstepe() {
		return estepe;
	}

	public Rodado getRodadoTraseiraDireita() {
		return traseiraDireita;
	}

	public Rodado getRodadoTraseiraEsquerda() {
		return traseiraEsquerda;
	}

}
