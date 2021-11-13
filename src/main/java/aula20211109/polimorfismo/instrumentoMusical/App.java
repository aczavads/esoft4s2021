package aula20211109.polimorfismo.instrumentoMusical;

public class App {
	
	public static void main(String[] args) {
		Músico joaquim = new Músico();
		
		joaquim.setInstrumento(new Violão());
		joaquim.setInstrumento(new Cavaquinho());
		
		joaquim.executarMúsica();
		
	}

}
