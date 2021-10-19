package aula20211015.frações;

public class AppFrações {
	
	public static void main(String[] args) {
		
		Fração umQuarto = new Fração(1, 4);
		
		// no console deve apresentar:   1/4
		System.out.println(umQuarto.toString());  
		
		// no console deve apresentar:   0.25
		System.out.println(umQuarto.asDouble());  
		
		Fração doisTerços = new Fração(2, 3);
		Fração trêsMeios = doisTerços.inverter();
		
		//   3/2
		System.out.println(trêsMeios.toString());
		
		System.out.println(umQuarto.multiplicarPor(doisTerços));
		System.out.println(umQuarto.dividirPor(doisTerços));
		
	}

}
