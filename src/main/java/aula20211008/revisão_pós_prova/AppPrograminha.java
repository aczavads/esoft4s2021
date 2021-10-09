package aula20211008.revisão_pós_prova;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class AppPrograminha {
	
	public static void main(String[] args) {
		List<Disciplina> disciplinas = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Digite o código da disciplina: ");
			String código = scanner.nextLine();
			
			System.out.print("Digite o nome da disciplina: ");
			String nome = scanner.nextLine();
			
			System.out.print("Digite a carga horária da disciplina: ");
			String cargaHorária = scanner.nextLine();
			
			Disciplina nova = new Disciplina();
			nova.setNome(nome);
			nova.setCódigo(código);
			nova.setCargaHorária(  Integer.valueOf(cargaHorária) );

			disciplinas.add(nova);
			
			System.out.println("Você possuí " + disciplinas.size() + " disciplina(s). Deseja continuar (S/N)? ");
			String continuar = scanner.nextLine();
			if (continuar.equalsIgnoreCase("N")) {
				break;
			}
		}
		System.out.println("A carga horária média das disciplinas é: " + calcularCargaHoráriaMédia(disciplinas));
		System.out.println("Existem disciplinas com as seguintes cargas horárias: " + recuperarCargasHoráriasDistintas(disciplinas));
		System.out.println("A(s) disciplina(s) com a menor carga horária é(são): " + recuperarDisciplinasComMenorCargaHorária(disciplinas));
		System.out.println("Tchau!");
	}
	
	public static double calcularCargaHoráriaMédia(List<Disciplina> disciplinas) {
		double cargaHoráriaTotal = 0.00;
		for (Disciplina disciplina : disciplinas) {
			cargaHoráriaTotal += disciplina.getCargaHorária();
		}
		return cargaHoráriaTotal / disciplinas.size();
	}
	public static String recuperarCargasHoráriasDistintas(List<Disciplina> disciplinas) {
		String cargasHoráriasDistintas = "";
		
		Set<String> conjuntoDeCargasHorárias = new HashSet<>();
		for (Disciplina disciplina : disciplinas) {
			conjuntoDeCargasHorárias.add( String.valueOf(disciplina.getCargaHorária()) );
		}
		
		for (String ch : conjuntoDeCargasHorárias) {
			cargasHoráriasDistintas += ch + " ";
		}
		return cargasHoráriasDistintas;
	}
}




