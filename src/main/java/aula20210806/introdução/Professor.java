package aula20210806.introdução;

public class Professor {
	private String nome;
	private int anoDeIngressoNaInstituição;
	private boolean especial;
	
	public int getAnoDeIngressoNaInstituição() {
		return anoDeIngressoNaInstituição;
	}
	
	public void setAnoDeIngressoNaInstituição(int novoAnoDeIngressoNaInstituição) {
		if (!especial) {
			if (novoAnoDeIngressoNaInstituição <= 0) {
				throw new RuntimeException("Ano de ingresso inválido!");
			}			
		}		
		this.anoDeIngressoNaInstituição = novoAnoDeIngressoNaInstituição;
	}
	
	public void setNome(String novoNome) {
		if (novoNome == null) {
			throw new RuntimeException("Nome não pode ser nulo!");
		}
		this.nome = novoNome;
	}
	
	//public String métodoQueRetornaONomeDoProfessor() {
	public String getNome() {
		return nome;
	}
	
	
	public Professor(String nome, int anoDeIngressoNaInstituição) {
		this(nome, anoDeIngressoNaInstituição, false);
	}
	
	
	public Professor(String nome, int anoDeIngressoNaInstituição, boolean especial) {
		this.especial = especial;
		this.setNome(nome);
		this.setAnoDeIngressoNaInstituição(anoDeIngressoNaInstituição);

	}

}
