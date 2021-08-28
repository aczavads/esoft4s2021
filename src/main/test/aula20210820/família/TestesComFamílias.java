package aula20210820.família;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestesComFamílias {

	@Test
	public void testarContagemComSobrepeso() {
		Família famíliaLima = new Família(4);
		
		famíliaLima.adicionar(new Pessoa("Papai Lima", 100, 88.50, 35));
		famíliaLima.adicionar(new Pessoa("Mamãe Lima", 100, 88.50, 38));
		famíliaLima.adicionar(new Pessoa("Filha Lima", 185, 55.00, 17));
		famíliaLima.adicionar(new Pessoa("Filho Lima", 185, 55.00, 19));
		
		
		assertEquals(2, famíliaLima.contarPessoasComSobrepeso());
	}
	
	@Test
	public void testarPercentualDaFamíliaComSobrepeso() {
		Família famíliaLima = new Família(4);
		
		famíliaLima.adicionar(new Pessoa("Papai Lima", 100, 88.50, 35));
		famíliaLima.adicionar(new Pessoa("Mamãe Lima", 100, 88.50, 38));
		famíliaLima.adicionar(new Pessoa("Filha Lima", 185, 55.00, 17));
		famíliaLima.adicionar(new Pessoa("Filho Lima", 185, 55.00, 19));
		
		
		assertEquals(50.00, famíliaLima.calcularPercentualPessoasComSobrepeso(), 0.00);
	}
	@Test
	public void testarSePessoasEstãoNaFamília() {
		Família família = new Família(2);
		
		Pessoa mãe = new Pessoa("Mãe", 100, 88.50, 38);
		Pessoa pai = new Pessoa("Pai", 100, 88.50, 35);
		família.adicionar(mãe);
		família.adicionar(pai);
		
		Pessoa[] pessoasDaFamília = família.getPessoas();
		//Tentando ferir o encapsulamento manipulando o array retornado pelo getPessoas().
		//Se getPessoas() retornar o array original, como se trata de uma referência, a família será inadvertidamente alterada.
		//Se getPessoas() retornar uma cópia do array original, a família estará protegida de manipulações externas.
		pessoasDaFamília[0] = null;
		pessoasDaFamília = família.getPessoas();
		
		assertSame(mãe, pessoasDaFamília[0]);
		assertSame(pai, pessoasDaFamília[1]);
		
	}

}
