package aula20210917.value_objects;

public abstract class Validações {
	

	public static void lançarExceçãoSeNomeInválido(String nome) {
		if (nome == null || nome.length() == 0) {
			throw new RuntimeException("Nome não pode ser nulo nem vazio!");
		}
	}

}
