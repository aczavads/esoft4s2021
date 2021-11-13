package lista01.exercício08;

public class Espécie {
	private String nomeCientífico;
	private String nomePopular;
	
	
	public Espécie(String nomePopular, String nomeCientífico) {
		this.nomeCientífico = nomeCientífico;
		this.nomePopular = nomePopular;
	}
	
	public String getNomeCientífico() {
		return nomeCientífico;
	}
	
	public String getNomePopular() {
		return nomePopular;
	}

	@Override
	public String toString() {
		return "Espécie [nomePopular=" + nomePopular + "]";
	}
	
	

}
