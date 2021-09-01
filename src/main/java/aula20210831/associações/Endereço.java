package aula20210831.associações;

public class Endereço {
	private String logradouro;
	private String número;
	private Cidade cidade;

	public Endereço(String logradouro, String número, Cidade cidade) {
		this.logradouro = logradouro;
		this.número = número;
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getNúmero() {
		return número;
	}

	public Cidade getCidade() {
		return cidade;
	}
}
