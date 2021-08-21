package aula20210820.família;

public class AppFamília {
	
	public static void main(String[] args) {
		
		
		Família famíliaLima = new Família(4);
		
		famíliaLima.adicionar(new Pessoa("Papai Lima", 178, 88.50, 35));
		famíliaLima.adicionar(new Pessoa("Mamãe Lima", 180, 70.50, 38));
		famíliaLima.adicionar(new Pessoa("Filha Lima", 160, 68.00, 17));
		famíliaLima.adicionar(new Pessoa("Filho Lima", 168, 55.00, 19));
		
		Família familiaAlmeida = new Família(2);
		familiaAlmeida.adicionar(new Pessoa("Amor Almeida 1", 195, 65.00, 26));
		familiaAlmeida.adicionar(new Pessoa("Amor Almeida 2", 170, 75.00, 24));

		//System.out.println(familiaLima[2].getIMC());			
		for (Pessoa pessoaDaVez : famíliaLima.getPessoas()) {
			System.out.println(pessoaDaVez.getNome() + ", imc = " + pessoaDaVez.getIMC());
		}	
		
		System.out.println("Pessoas com sobrepeso na família lima = " 
				+ famíliaLima.contarPessoasComSobrepeso());

		System.out.println("Pessoas com sobrepeso na família almeida = " 
				+ familiaAlmeida.contarPessoasComSobrepeso());

	}

}
