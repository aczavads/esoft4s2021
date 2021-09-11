package aula20210910.atividade01.pedido;

public class ItemPedido {
	private double quantidade;
	private double valorUnitário;
	private Produto produto;
	
	
	public ItemPedido(double quantidade, double valorUnitário, Produto produto) {
		this.quantidade = quantidade;
		this.valorUnitário = valorUnitário;
		this.produto = produto;		
	}
	
	public double getQuantidade() {
		return this.quantidade;
	}
	
	public double getValorUnitário() {
		return this.valorUnitário;
	}
	
	public Produto getProduto() {
		return this.produto;
	}
	
	//+ getValorTotal() : double
	public double getValorTotal() {
		return quantidade * valorUnitário;
	}
}
