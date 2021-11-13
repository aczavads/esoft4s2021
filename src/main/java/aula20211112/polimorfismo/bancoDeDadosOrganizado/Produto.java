package aula20211112.polimorfismo.bancoDeDadosOrganizado;

public class Produto {
	private Integer id;
	private String nome;
	
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Produto(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + "]";
	}
	
	

}
