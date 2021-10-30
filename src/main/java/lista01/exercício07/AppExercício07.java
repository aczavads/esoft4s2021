package lista01.exercício07;

public class AppExercício07 {
	
	public static void main(String[] args) {
		Veículo v1 = new Veículo();
		v1.instalarRodadoDianteiraDireita(new Rodado(new Pneu("Pirelli", "P4", 175, 65, 14)));
		v1.instalarRodadoDianteiraEsquerda(new Rodado(new Pneu("Pirelli", "P4", 175, 65, 14)));
		v1.instalarRodadoTraseiraDireita(new Rodado(new Pneu("Barum", "A7", 175, 65, 14)));
		v1.instalarRodadoTraseiraEsquerda(new Rodado(new Pneu("Barum", "A7", 175, 65, 14)));
		v1.instalarRodadoEstepe(new Rodado(new Pneu("Pirelli", "Cinturatto", 175, 65, 14)));
		
		v1.getRodadoDianteiraDireita().calibrar(30);
		v1.getRodadoDianteiraEsquerda().calibrar(30);
		v1.getRodadoTraseiraDireita().calibrar(32);
		v1.getRodadoTraseiraEsquerda().calibrar(32);
		v1.getRodadoEstepe().calibrar(34);
		
		System.out.println(v1.getRodadoDianteiraDireita().getPressão());
		System.out.println(v1.getRodadoDianteiraEsquerda().getPressão());
		System.out.println(v1.getRodadoTraseiraDireita().getPressão());
		System.out.println(v1.getRodadoTraseiraEsquerda().getPressão());
		System.out.println(v1.getRodadoEstepe().getPressão());		
	}

}
