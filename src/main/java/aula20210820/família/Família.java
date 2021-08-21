package aula20210820.família;

public class Família {
	private Pessoa[] pessoas;
	private int contador = 0;
	
	public Família(int tamanho) {
		this.pessoas = new Pessoa[tamanho];
	}
	
	public Pessoa[] getPessoas() {
		return this.pessoas;
	}

	public void adicionar(Pessoa pessoa) {
		this.pessoas[contador] = pessoa;
		contador++;
	}
	
	public int contarPessoasComSobrepeso() {
		//sobrepeso = imc > 24.9
		int contagem = 0;		
		for (Pessoa membro : this.pessoas) {
			if (membro.getIMC() > 24.9) {
				contagem++;
			}
		}		
		return contagem;
	}	

}
