package aula20211112.polimorfismo.instrumentoMusicalComSuperclasse;

public class App {
	
	public static void main(String[] args) {
		Músico joaquim = new Músico();
		
		joaquim.setInstrumento(new Violão());
		joaquim.setInstrumento(new Cavaquinho());
		
		joaquim.executarMúsica();
		
	}

}
