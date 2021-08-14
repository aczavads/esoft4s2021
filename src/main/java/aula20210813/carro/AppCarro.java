package aula20210813.carro;

public class AppCarro {
	
	public static void main(String[] args) {
		Carro meu = new Carro(55);
		Carro seu = new Carro(57);
		
		
		meu.abastecer(50);
		meu.abastecer(5);
		
		for (int i = 1; i <= 55; i++) {
			meu.ligar();
			meu.desligar();
		}
		meu.ligar();
		
		
		System.out.println("Foi.");
	}

}
