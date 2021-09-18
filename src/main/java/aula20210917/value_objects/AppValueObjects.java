package aula20210917.value_objects;

public class AppValueObjects {
	
	public static void main(String[] args) {
		Medicamento m1 = new Medicamento(new Nome("Aspirina"));
		Pessoa p1 = new Pessoa(new Nome("Josias"));
		Pet pet1 = new Pet(new Nome("Tobias"));
		Pet pet2 = new Pet(new Nome("Lilica"));
		Pet pet3 = new Pet(new Nome("Babi"));
		//pet1.setNome(new Nome(null));
		
		
		System.out.println(m1);
		System.out.println(p1);
		System.out.println(pet1);
		System.out.println(pet2);
		System.out.println(pet3);
		
	}

}
