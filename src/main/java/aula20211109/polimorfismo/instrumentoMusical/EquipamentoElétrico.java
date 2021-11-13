package aula20211109.polimorfismo.instrumentoMusical;

public interface EquipamentoElétrico {	
	
	default void ligar() {
		System.out.println("Ligando via método padrão do EquipamentoElétrico...");
	}
	void desligar();

}
