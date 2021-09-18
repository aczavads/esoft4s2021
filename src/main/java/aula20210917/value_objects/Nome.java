package aula20210917.value_objects;

public class Nome {
	private String valor;
			
	public Nome(String valor) {
		if (valor == null || valor.length() == 0) {
			throw new RuntimeException("Nome não pode ser nulo nem vazio!");
		}		
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return valor;
	}

}
