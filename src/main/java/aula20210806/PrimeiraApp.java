package aula20210806;

import aula20210806.introdução.Professor;

public class PrimeiraApp {
	
	public static void main(String[] args) {
		System.out.println("Primeira!!! :D");
		
		Professor cidão = new Professor("Aparecido Vilela Júnior", 2010);
		Professor novo = new Professor("null", 0, true);
		
		System.out.println("Foi..");
		
		//System.out.println("Nome completo do 'cidão' é: " + cidão.métodoQueRetornaONomeDoProfessor());
		//cidão.setNome(null);
		cidão.setAnoDeIngressoNaInstituição(-2020);
		System.out.println("Nome completo do 'cidão' é: " + cidão.getNome());
		
	}
	
}
