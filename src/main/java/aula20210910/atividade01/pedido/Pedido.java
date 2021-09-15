package aula20210910.atividade01.pedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private int número;
	private List<ItemPedido> itens = new ArrayList<>(); 
	
	public Pedido(int número) {
		this.número = número;
	}
	
	public int getNúmero() {
		return this.número;
	}
	
	public void removerItemComProduto(Produto p) {
		int posiçãoDoItemParaRemover = -1;
		for (int i = 0; i < itens.size(); i++) {
			ItemPedido ip = itens.get(i);
			if (ip.getProduto() == p) {
				posiçãoDoItemParaRemover = i;
				break;
			}
		}
		if (posiçãoDoItemParaRemover != -1) {
			itens.remove(posiçãoDoItemParaRemover);
		}
	}
	
	public void adicionarItem(ItemPedido novo) {
		
		boolean jáTemProdutoNoPedido = false;
		//escreva aqui seu código que percorra os itens do pedido, comparando o produto de cada item
		//com o produto do novo item. Se encontrar produto igual, jáTemProdutoNoPedido recebe true.
		for (ItemPedido ip : itens) {
			if (ip.getProduto() == novo.getProduto()) {
				jáTemProdutoNoPedido = true;
				break;
			}
		}
		
		if (jáTemProdutoNoPedido) {
			throw new RuntimeException("Produto já adicionado ao pedido!");
		}
		this.itens.add(novo);
	}
	
	//+ getValorTotal() : double
	public double getValorTotal() {
		//implemente aqui seu algoritmo...
		double valorTotal = 0.00;
		/*
		for (int i = 0; i < itens.size(); i++) {
			ItemPedido ip = itens.get(i);
			valorTotal += ip.getValorTotal();
		}
		*/
		for (ItemPedido ip : itens) {
			valorTotal += ip.getValorTotal();
		}
		return valorTotal;
	}

}
