package lista01.exercício07;

public class Pneu {
	private String marca;
	private String modelo;
	private int largura;
	private int altura;
	private int aro;

	public Pneu(String marca, String modelo, int largura, int altura, int aro) {
		this.marca = marca;
		this.modelo = modelo;
		this.largura = largura;
		this.altura = altura;
		this.aro = aro;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getLargura() {
		return largura;
	}

	public int getAltura() {
		return altura;
	}

	public int getAro() {
		return aro;
	}
	
	
	
}
