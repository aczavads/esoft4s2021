package aula20211112.polimorfismo.instrumentoMusicalComSuperclasse;

public class Músico {

	private InstrumentoMusical instrumento;

	public void setInstrumento(InstrumentoMusical instrumento) {
		this.instrumento = instrumento;
	}

	public void executarMúsica() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.instrumento.emitirDó() + " ");
		sb.append(this.instrumento.emitirRé() + " ");
		sb.append(this.instrumento.emitirMi() + " ");
		sb.append(this.instrumento.emitirFá() + " ");
		sb.append(this.instrumento.emitirFá() + " ");
		sb.append(this.instrumento.emitirFá() + " ");
		sb.append(this.instrumento.emitirDó() + " ");
		sb.append(this.instrumento.emitirRé() + " ");
		sb.append(this.instrumento.emitirDó() + " ");
		sb.append(this.instrumento.emitirRé() + " ");
		sb.append(this.instrumento.emitirRé() + " ");
		sb.append(this.instrumento.emitirRé() + " ");
		sb.append(this.instrumento.emitirDó() + " ");
		sb.append(this.instrumento.emitirSol() + " ");
		sb.append(this.instrumento.emitirFá() + " ");
		sb.append(this.instrumento.emitirMi() + " ");
		sb.append(this.instrumento.emitirMi() + " ");
		sb.append(this.instrumento.emitirMi() + " ");
		sb.append(this.instrumento.emitirDó() + " ");
		sb.append(this.instrumento.emitirRé() + " ");
		sb.append(this.instrumento.emitirMi() + " ");
		sb.append(this.instrumento.emitirFá() + " ");
		sb.append(this.instrumento.emitirFá() + " ");
		sb.append(this.instrumento.emitirFá() + " ");
		System.out.println(sb.toString());
	}

}
