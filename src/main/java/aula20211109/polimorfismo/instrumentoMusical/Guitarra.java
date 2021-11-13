package aula20211109.polimorfismo.instrumentoMusical;

public class Guitarra implements InstrumentoMusical, EquipamentoElétrico {

	@Override
	public String emitirDó() {
		return "Dó guitarra";
	}

	@Override
	public String emitirRé() {
		return "Ré guitarra";
	}

	@Override
	public String emitirMi() {
		return "Mi guitarra";
	}

	@Override
	public String emitirFá() {
		return "Fá guitarra";
	}

	@Override
	public String emitirSol() {
		return "Sol guitarra";
	}

	@Override
	public String emitirLá() {
		return "Lá guitarra";
	}

	@Override
	public String emitirSi() {
		return "Si guitarra";
	}

//	@Override
//	public void ligar() {
//		System.out.println("Ligando a guitarra.");
//	}

	@Override
	public void desligar() {
		System.out.println("Desligando a guitarra.");		
	}

}
