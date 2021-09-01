package aula20210831.associações;

public class AppAssociações {
	
	
	public static void imprimirEndereçosDaPessoa(Pessoa p) {
		System.out.println();
		System.out.println("Endereços de " + p.getNome());
		for (Endereço e : p.getEndereços()) {
			System.out.println(
					e.getLogradouro() 
					+ ", " 
					+ e.getNúmero() 
					+ " - " 
					+ e.getCidade().getNome());
		}		
	}
		
	public static void main(String[] args) {
		Pessoa ana = new Pessoa("Ana Maria");
		Pessoa fulano = new Pessoa("Fulano de Tal");
		Pessoa laura = new Pessoa("Laura Beatriz");
		
		Cidade marialva = new Cidade("Marialva");
		Cidade maringá = new Cidade("Maringá");
		Cidade santaFé = new Cidade("Santa Fé");
		Cidade mandaguari = new Cidade("Mandaguari");
		
		fulano.addEndereço(new Endereço("Av. Brasil", "777a", maringá));
		fulano.addEndereço(new Endereço("Rua Andorinhas", "1232", marialva));
		fulano.addEndereço(new Endereço("Rua Santos Dumont", "555", marialva));
		
		ana.addEndereço(new Endereço("Rua das Acácias", "33", mandaguari));
		laura.addEndereço(new Endereço("Rua das Camélias", "9887", mandaguari));
		laura.addEndereço(new Endereço("Av. Canadá", "78", santaFé));
		
		imprimirEndereçosDaPessoa(fulano);
		imprimirEndereçosDaPessoa(ana);
		imprimirEndereçosDaPessoa(laura);
		/*
		System.out.println("Endereços de Fulano");
		for (Endereço e : fulano.getEndereços()) {
			System.out.println(
					e.getLogradouro() 
					+ ", " 
					+ e.getNúmero() 
					+ " - " 
					+ e.getCidade().getNome());
		}
		System.out.println("Endereços de Ana");
		for (Endereço e : ana.getEndereços()) {
			System.out.println(
					e.getLogradouro() 
					+ ", " 
					+ e.getNúmero() 
					+ " - " 
					+ e.getCidade().getNome());
		}
		System.out.println("Endereços de Laura");
		for (Endereço e : laura.getEndereços()) {
			System.out.println(
					e.getLogradouro() 
					+ ", " 
					+ e.getNúmero() 
					+ " - " 
					+ e.getCidade().getNome());
		}
		*/
		
	}

}
