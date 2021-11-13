package lista01.exercício08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
	
	public static void main(String[] args) {
		
		Espécie sequoia = new Espécie("Sequoia", "Sequoiadendron giganteum");
		Espécie sibipiruna = new Espécie("Sibipiruna", "Caesalpinia pluviosa");
		Espécie ipêRoxo = new Espécie("Ipê-roxo","Handroanthus impetiginosus");
		
		List<Árvore> árvores = criarMilComAlturasDiferentes(new Espécie[] {sequoia, sibipiruna, ipêRoxo});
		for (Árvore árvore : árvores) {
			System.out.println(árvore);
		}
						
		Set<Árvore> conjuntoDeÁrvores = new HashSet<>(árvores);
		Floresta bosqueLindoAlvorada = new Floresta("Bosque Lindo Alvorada", conjuntoDeÁrvores);

		
		conjuntoDeÁrvores = bosqueLindoAlvorada.getÁrvores();
		conjuntoDeÁrvores.remove(árvores.get(0));
		
		System.out.println(">>> Quantidade de árvores na floresta: " + bosqueLindoAlvorada.getÁrvores().size());

		System.out.println(">>> Espécies presentes no Bosque Lindo Alvorada:");
		for (Espécie e : bosqueLindoAlvorada.getEspéciesPresentes()) {
			System.out.println(e);
		}
		
		
	}

	private static List<Árvore> criarMilComAlturasDiferentes(Espécie[] espécies) {
		final int QUANTIDADE = 1000;
		List<Árvore> árvores = new ArrayList<>();
		int quantidadePorEspécie = QUANTIDADE / espécies.length;
		int diferença = QUANTIDADE - (quantidadePorEspécie * espécies.length);
		System.out.println(diferença);
		int contadorGeral = 1;
		for (Espécie espécie : espécies) {
			for (int i = 1; i <= quantidadePorEspécie; i++) {
				árvores.add(new Árvore(espécie, contadorGeral++ * 1.02));
			}
		}
		árvores.add(new Árvore(espécies[espécies.length-1], (QUANTIDADE+1) * 1.02));		
		return árvores;
	}

}
