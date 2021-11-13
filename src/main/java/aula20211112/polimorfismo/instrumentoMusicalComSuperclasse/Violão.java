package aula20211112.polimorfismo.instrumentoMusicalComSuperclasse;

public class Violão extends InstrumentoMusical {

	@Override
	public String emitirDó() {
		return "Dó do violão";
	}

	@Override
	public String emitirRé() {
		return "Ré do violão";
	}

	@Override
	public String emitirMi() {
		return "Mi do violão";
	}

	@Override
	public String emitirFá() {
		return "Fá do violão";
	}

	@Override
	public String emitirSol() {
		return "Sol do violão";
	}

	@Override
	public String emitirLá() {
		return "Lá do violão";
	}
	
	@Override
	public String emitirSi() {
		return "Si do violão";
	}

}
