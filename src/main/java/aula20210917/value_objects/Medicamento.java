package aula20210917.value_objects;

public class Medicamento {
	private Nome nome;
	
	public Medicamento(Nome nome) {
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
		return "Medicamento [nome=" + nome + "]";
	}

}
