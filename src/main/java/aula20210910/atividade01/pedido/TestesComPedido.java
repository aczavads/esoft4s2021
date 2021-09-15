package aula20210910.atividade01.pedido;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestesComPedido {

	@Test
	public void testarSePedidoCalculaTotalCorretamente() {
		Produto omo = new Produto("Omo Progress 1kg");
		Produto mel = new Produto("Mel Apiaris Premium");
		Produto arroz = new Produto("Arroz Brilhante 5kg");

		Pedido pedido01 = new Pedido(1);
		pedido01.adicionarItem(new ItemPedido(1, 6.75, omo));
		pedido01.adicionarItem(new ItemPedido(2, 15.00, mel));

		//System.out.println(pedido01.getValorTotal()); // será impresso no console 36.75
		assertEquals(36.75, pedido01.getValorTotal(), 0.00);		
	}
	@Test
	public void testarSePedidoCalculaTotalCorretamenteApósRemoçãoDeItem() {
		Produto omo = new Produto("Omo Progress 1kg");
		Produto mel = new Produto("Mel Apiaris Premium");
		Produto arroz = new Produto("Arroz Brilhante 5kg");

		Pedido pedido01 = new Pedido(1);
		pedido01.adicionarItem(new ItemPedido(1, 6.75, omo));
		pedido01.adicionarItem(new ItemPedido(2, 15.00, mel));

		pedido01.removerItemComProduto(omo);
		
		assertEquals(30.00, pedido01.getValorTotal(), 0.00);		
	}

}
