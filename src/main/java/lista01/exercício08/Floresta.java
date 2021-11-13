package lista01.exercício08;

import java.util.HashSet;
import java.util.Set;

public class Floresta {
	private String nome;
	private Set<Árvore> árvores;// = new HashSet<>();
	
	public Floresta(String nome, Set<Árvore> árvores) {
		this.árvores = new HashSet<>(árvores);
		System.out.println(">>> construindo a floresta com " + árvores.size() + " árvores.");
	}
	
	public String getNome() {
		return nome;
	}
	
	public Set<Árvore> getÁrvores() {
		return new HashSet<>(árvores);
	}
	
	//+ getEspéciesPresentes() : List<Espécie>
	public Set<Espécie> getEspéciesPresentes() {
		Set<Espécie> espéciesNãoRepetidas = new HashSet<>();
		for (Árvore árvore : árvores) {
			espéciesNãoRepetidas.add(árvore.getEspécie());
		}
		return espéciesNãoRepetidas;
	}
	

}
