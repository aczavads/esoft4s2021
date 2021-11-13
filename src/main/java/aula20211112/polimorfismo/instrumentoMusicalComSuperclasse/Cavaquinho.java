package aula20211112.polimorfismo.instrumentoMusicalComSuperclasse;

public class Cavaquinho extends InstrumentoMusical {

	@Override
	public String emitirDó() {
		return "Dó cavaco";
	}

	@Override
	public String emitirRé() {
		return "Ré cavaco";
	}

	@Override
	public String emitirMi() {
		return "Mi cavaco";
	}

	@Override
	public String emitirFá() {
		return "Fá cavaco";
	}

	@Override
	public String emitirSol() {
		return "Sol cavaco";
	}

	@Override
	public String emitirLá() {
		return "Lá cavaco";
	}

	@Override
	public String emitirSi() {
		return "Si cavaco";
	}

}
