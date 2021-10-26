package lista01.exercício04;

import java.util.ArrayList;
import java.util.List;

public class AppExercício04 {
	
	public static void main(String[] args) {
		String[] valores = {
				"valor 01",
				"valor 02",
				"valor 03",
				"valor 04",
				"valor 05",
				"valor 06",
				"valor 07",
				"valor 08",
				"valor 09",
				"valor 10"};
		
		List<String> listaDeValores = new ArrayList<>();
		
		for (int i = 0; i < valores.length; i++) {
			listaDeValores.add(valores[i]);
		}
		
		System.out.println("Valores do array...");
		for (String v : valores) {
			System.out.println(v);
		}
		System.out.println("Valores da lista...");
		for (String v : listaDeValores) {
			System.out.println(v);
		}
		
	}

}
