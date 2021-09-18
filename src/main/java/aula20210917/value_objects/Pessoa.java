package aula20210917.value_objects;

public class Pessoa {
	private Nome nome;
	
	public Pessoa(Nome nome) {
		this.nome = nome;
	}
	

	public Nome getNome() {
		return nome;
	}
	
	public void setNome(Nome nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}
	
	

}
