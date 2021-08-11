package aula20210806.introdução;

public class Professor {
	private String nome;
	private int anoDeIngressoNaInstituição;
	
	//public String métodoQueRetornaONomeDoProfessor() {
	public String getNome() {
		return nome;
	}
	
	
	public Professor(String nome, int anoDeIngressoNaInstituição) {
		this(nome, anoDeIngressoNaInstituição, false);
	}
	
	
	public Professor(String nome, int anoDeIngressoNaInstituição, boolean especial) {
		if (nome == null) {
			throw new RuntimeException("Nome não pode ser nulo!");
		}
		if (!especial) {
			if (anoDeIngressoNaInstituição <= 0) {
				throw new RuntimeException("Ano de ingresso inválido!");
			}
			
		}
		this.nome = nome;
		this.anoDeIngressoNaInstituição = anoDeIngressoNaInstituição;
	}

}
