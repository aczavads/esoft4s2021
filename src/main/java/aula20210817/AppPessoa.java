package aula20210817;

public class AppPessoa {
	
	public static void main(String[] args) {
		Pessoa[] familiaLima = new Pessoa[4];
		
		familiaLima[0] = new Pessoa("Papai Lima", 178, 88.50, 35);
		familiaLima[1] = new Pessoa("Mamãe Lima", 180, 70.50, 38);
		familiaLima[2] = new Pessoa("Filha Lima", 160, 68.00, 17);
		familiaLima[3] = new Pessoa("Filho Lima", 168, 55.00, 19);
		
		Pessoa[] familiaAlmeida = new Pessoa[2];
		familiaAlmeida[0] = new Pessoa("Amor Almeida 1", 195, 65.00, 26);
		familiaAlmeida[1] = new Pessoa("Amor Almeida 2", 170, 75.00, 24);

		//System.out.println(familiaLima[2].getIMC());			
		for (Pessoa pessoaDaVez : familiaLima) {
			System.out.println(pessoaDaVez.getNome() + ", imc = " + pessoaDaVez.getIMC());
		}	
		
		System.out.println("Pessoas com sobrepeso na família lima = " 
				+ contarPessoasComSobrepesoNaFamilia(familiaLima));

		System.out.println("Pessoas com sobrepeso na família almeida = " 
				+ contarPessoasComSobrepesoNaFamilia(familiaAlmeida));

	}
	
	public static int contarPessoasComSobrepesoNaFamilia(Pessoa[] família) {
		//sobrepeso = imc > 24.9
		int contagem = 0;		
		for (Pessoa membro : família) {
			if (membro.getIMC() > 24.9) {
				contagem++;
			}
		}		
		return contagem;
	}
}
