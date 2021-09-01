package aula20210831.associações;

public class AppAssociações {
	
	public static void main(String[] args) {
		Pessoa fulano = new Pessoa("Fulano de Tal");
		
		Cidade marialva = new Cidade("Marialva");
		Cidade maringá = new Cidade("Maringá");
		
		fulano.addEndereço(new Endereço("Av. Brasil", "777a", maringá));
		fulano.addEndereço(new Endereço("Rua Andorinhas", "1232", marialva));
		fulano.addEndereço(new Endereço("Rua Santos Dumont", "555", marialva));
		
		System.out.println("Endereços de Fulano");
		for (Endereço e : fulano.getEndereços()) {
			System.out.println(
					e.getLogradouro() 
					+ ", " 
					+ e.getNúmero() 
					+ " - " 
					+ e.getCidade().getNome());
		}
		
	}

}
