package aula20210917.value_objects;

public class Pet {
	private Nome nome;
	
	public Pet(Nome nome) {
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
		return "Pet [nome=" + nome + "]";
	}
	
	

}
