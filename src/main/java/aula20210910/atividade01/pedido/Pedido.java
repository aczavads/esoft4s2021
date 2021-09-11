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
	
	public void adicionarItem(ItemPedido novo) {
		this.itens.add(novo);
	}

}
