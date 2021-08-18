package aula20210817;

public class Pessoa {
	private String nome;
    private int alturaEmCentímetros;
    private double pesoEmQuilos;
    private int idadeEmAnos;
    
    public Pessoa(String nome, int alturaEmCentímetros, 
    		double pesoEmQuilos, int idadeEmAnos) {
		this.nome = nome;
		this.alturaEmCentímetros = alturaEmCentímetros;
		this.pesoEmQuilos = pesoEmQuilos;
		this.idadeEmAnos = idadeEmAnos;
	}
    
	public double getIMC() {
    	return getPesoEmQuilos() / (getAlturaEmMetros() * getAlturaEmMetros());
    }
    public double getAlturaEmMetros() {
    	return alturaEmCentímetros / 100.0;
    }
    public double getAlturaEmCentímetros() {
    	return alturaEmCentímetros;
    }
    public String getNome() {
		return nome;
	}
    public int getIdadeEmAnos() {
		return idadeEmAnos;
	}
    public double getPesoEmQuilos() {
		return pesoEmQuilos;
	}

}