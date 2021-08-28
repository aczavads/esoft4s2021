package aula20210827.listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class AppListasMeses {

	public static void main(String[] args) {
//		String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
//				"Outubro", "Novembro", "Dezembro" };
		String[] arrayDeMeses = new String[12];
		arrayDeMeses[0] = "Janeiro";
		arrayDeMeses[1] = "Fevereiro";
		arrayDeMeses[2] = "Março";
		arrayDeMeses[3] = "Abril";
		arrayDeMeses[4] = "Maio";
		arrayDeMeses[5] = "Junho";
		arrayDeMeses[6] = "Julho";
		arrayDeMeses[7] = "Agosto";
		arrayDeMeses[8] = "Setembro";
		arrayDeMeses[9] = "Outubro";
		arrayDeMeses[10] = "Novembro";
		arrayDeMeses[11] = "Dezembro";

		System.out.println("Mês 3 = " + arrayDeMeses[2]);
		
		List<String> listaDeMeses = new LinkedList<>(); //new ArrayList(); //ou new Vector() ou new LinkedList() ou new whatever...
		listaDeMeses.add("Janeiro");
		listaDeMeses.add("Fevereiro");
		listaDeMeses.add("Março");
		listaDeMeses.add("Abril");
		listaDeMeses.add("Maio");
		listaDeMeses.add("Junho");
		listaDeMeses.add("Julho");
		listaDeMeses.add("Agosto");
		listaDeMeses.add("Setembro");
		listaDeMeses.add("Outubro");
		listaDeMeses.add("Novembro");
		listaDeMeses.add("Dezembro");
		
		System.out.println("Mês 3 na lista = " + listaDeMeses.get(2));
		listaDeMeses.remove(2);
		System.out.println(listaDeMeses.size());
		
		//Collection<String> coleçãoDeMeses = new ArrayList<>();
		Collection<String> coleçãoDeMeses = new HashSet<>();
		coleçãoDeMeses.add("Janeiro");
		coleçãoDeMeses.add("Janeiro");
		coleçãoDeMeses.add("Janeiro");
		coleçãoDeMeses.add("Janeiro");
		coleçãoDeMeses.add("Dezembro");
		coleçãoDeMeses.add("Dezembro");
		coleçãoDeMeses.add("Dezembro");
		
		for (Object mês : coleçãoDeMeses) {
			System.out.println(mês);
		}
		
	}

}
