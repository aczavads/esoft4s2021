package aula20210820.família;

import java.util.Arrays;

public class Família {
	private Pessoa[] pessoas;
	private int posiçãoPróximaPessoa = 0;
	
	public Família(int tamanho) {
		this.pessoas = new Pessoa[tamanho];
	}
	
	public Pessoa[] getPessoas() {
		return Arrays.copyOf(this.pessoas, this.pessoas.length);
		//return this.pessoas;
	}

	public void adicionar(Pessoa pessoa) {
		if (espaçoEsgotado()) {
			pessoas = criarNovoArrayComUmEspaçoExtra(pessoas);
		}
		this.pessoas[posiçãoPróximaPessoa] = pessoa;
		posiçãoPróximaPessoa++;
	}
	
	private Pessoa[] criarNovoArrayComUmEspaçoExtra(Pessoa[] pessoasExistentes) {
		Pessoa[] novoArrayComEspaçoExtra = new Pessoa[pessoasExistentes.length+1];
		for (int i = 0; i < pessoasExistentes.length; i++) {
			novoArrayComEspaçoExtra[i] = pessoasExistentes[i];
		}
		return novoArrayComEspaçoExtra;
	}

	private boolean espaçoEsgotado() {
		return posiçãoPróximaPessoa == pessoas.length;
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

	public double calcularPercentualPessoasComSobrepeso() {
		double percentual = 0.0;
		percentual = (contarPessoasComSobrepeso() / (double)posiçãoPróximaPessoa) * 100.00; 
		return percentual;
	}
}



