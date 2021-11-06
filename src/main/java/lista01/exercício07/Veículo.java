package lista01.exercício07;

public class Veículo {

	private Rodado dianteiraDireita;
	private Rodado dianteiraEsquerda;
	private Rodado traseiraDireita;
	private Rodado traseiraEsquerda;
	private Rodado estepe;

	public void instalarRodadoDianteiraDireita(Rodado rodado) {
		validarDimensãoNaInstalaçãoDoRodado(rodado);
		this.dianteiraDireita = rodado;
	}


	public void instalarRodadoDianteiraEsquerda(Rodado rodado) {
		validarDimensãoNaInstalaçãoDoRodado(rodado);
		this.dianteiraEsquerda = rodado;
	}

	public void instalarRodadoTraseiraDireita(Rodado rodado) {
		validarDimensãoNaInstalaçãoDoRodado(rodado);
		this.traseiraDireita = rodado;
	}

	public void instalarRodadoTraseiraEsquerda(Rodado rodado) {
		validarDimensãoNaInstalaçãoDoRodado(rodado);
		this.traseiraEsquerda = rodado;
	}

	public void instalarRodadoEstepe(Rodado rodado) {
		validarDimensãoNaInstalaçãoDoRodado(rodado);
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

	
	private void validarDimensãoNaPosiçãoEspecífica(Rodado posição, Rodado novoRodadoSendoInstalado) {
		if (posição != null && posição.getPneu() != null) {
			boolean aroIgual = novoRodadoSendoInstalado.getPneu().getAro() == posição.getPneu().getAro();
			boolean larguraIgual = novoRodadoSendoInstalado.getPneu().getLargura() == posição.getPneu().getLargura();
			boolean alturaIgual = novoRodadoSendoInstalado.getPneu().getAltura() == posição.getPneu().getAltura();
			if (!aroIgual || !larguraIgual || !alturaIgual) {
				throw new RuntimeException("Rodados devem ter as mesmas dimensões!");
			}
		}		
	}
	
	private void validarDimensãoNaInstalaçãoDoRodado(Rodado rodado) {
		validarDimensãoNaPosiçãoEspecífica(dianteiraDireita, rodado);
		validarDimensãoNaPosiçãoEspecífica(dianteiraEsquerda, rodado);
		validarDimensãoNaPosiçãoEspecífica(traseiraDireita, rodado);
		validarDimensãoNaPosiçãoEspecífica(traseiraEsquerda, rodado);
		validarDimensãoNaPosiçãoEspecífica(estepe, rodado);
		/*
		if (dianteiraDireita != null) {
			boolean aroIgual = rodado.getPneu().getAro() == dianteiraDireita.getPneu().getAro();
			boolean larguraIgual = rodado.getPneu().getLargura() == dianteiraDireita.getPneu().getLargura();
			boolean alturaIgual = rodado.getPneu().getAltura() == dianteiraDireita.getPneu().getAltura();
			if (!aroIgual || !larguraIgual || !alturaIgual) {
				throw new RuntimeException("Rodados devem ter as mesmas dimensões!");
			}
		}
		if (dianteiraEsquerda != null) {
			boolean aroIgual = rodado.getPneu().getAro() == dianteiraEsquerda.getPneu().getAro();
			boolean larguraIgual = rodado.getPneu().getLargura() == dianteiraEsquerda.getPneu().getLargura();
			boolean alturaIgual = rodado.getPneu().getAltura() == dianteiraEsquerda.getPneu().getAltura();
			if (!aroIgual || !larguraIgual || !alturaIgual) {
				throw new RuntimeException("Rodados devem ter as mesmas dimensões!");
			}
		}
		if (traseiraEsquerda != null) {
			boolean aroIgual = rodado.getPneu().getAro() == traseiraEsquerda.getPneu().getAro();
			boolean larguraIgual = rodado.getPneu().getLargura() == traseiraEsquerda.getPneu().getLargura();
			boolean alturaIgual = rodado.getPneu().getAltura() == traseiraEsquerda.getPneu().getAltura();
			if (!aroIgual || !larguraIgual || !alturaIgual) {
				throw new RuntimeException("Rodados devem ter as mesmas dimensões!");
			}
		}
		if (traseiraDireita != null) {
			boolean aroIgual = rodado.getPneu().getAro() == traseiraDireita.getPneu().getAro();
			boolean larguraIgual = rodado.getPneu().getLargura() == traseiraDireita.getPneu().getLargura();
			boolean alturaIgual = rodado.getPneu().getAltura() == traseiraDireita.getPneu().getAltura();
			if (!aroIgual || !larguraIgual || !alturaIgual) {
				throw new RuntimeException("Rodados devem ter as mesmas dimensões!");
			}
		}
		if (estepe != null) {
			boolean aroIgual = rodado.getPneu().getAro() == estepe.getPneu().getAro();
			boolean larguraIgual = rodado.getPneu().getLargura() == estepe.getPneu().getLargura();
			boolean alturaIgual = rodado.getPneu().getAltura() == estepe.getPneu().getAltura();
			if (!aroIgual || !larguraIgual || !alturaIgual) {
				throw new RuntimeException("Rodados devem ter as mesmas dimensões!");
			}
		}
		*/
	}
	
}
