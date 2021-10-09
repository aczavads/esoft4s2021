package aula20211008.revisão_pós_prova;

public class Disciplina {
	private String código;
	private String nome;
	private int cargaHorária;
	
	
	public void setCódigo(String novoCódigo) {
		código = novoCódigo;
	}
	
	public void setNome(String novoNome) {
		nome = novoNome;
	}
	
	public void setCargaHorária(int cargaHorária) {
		this.cargaHorária = cargaHorária;
	}
	
	public double getCargaHorária() {
		return cargaHorária;
	}
}
