package lista01.exercício05;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AppExercício05 {
	
	public static void main(String[] args) {
		List<String> valores = List.of("oi", "tchau", "beleza", 
				"e aí", "oi", "tchau", "oi", "tchau", "e aí", "oi");
		
//		Set<String> conjuntoDeValores = new HashSet<>();		
//		for (String v : valores) {
//			conjuntoDeValores.add(v);
//		}
		
		System.out.println("Valores da lista...");
		for (String v : valores) {
			System.out.println(v);
		}
		
		Set<String> conjuntoDeValores = new TreeSet<>(valores);				
		System.out.println("Valores do conjunto...");
		for (String v : conjuntoDeValores) {
			System.out.println(v);
		}
		
	}

}
