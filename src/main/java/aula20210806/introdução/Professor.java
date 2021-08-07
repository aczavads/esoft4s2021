package aula20210806.introdução;

public class Professor {
	private String nome;
	private int anoDeIngressoNaInstituição;
	
	
	public Professor(String nome, int anoDeIngressoNaInstituição) {
		if (nome == null) {
			throw new RuntimeException("Nome não pode ser nulo!");
		}
		if (anoDeIngressoNaInstituição <= 0) {
			throw new RuntimeException("Ano de ingresso inválido!");
		}
		this.nome = nome;
		this.anoDeIngressoNaInstituição = anoDeIngressoNaInstituição;
	}

}
