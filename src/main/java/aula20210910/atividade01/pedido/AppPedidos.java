package aula20210910.atividade01.pedido;

public class AppPedidos {
	
	public static void main(String[] args) {
		Produto omo = new Produto("Omo Progress 1kg");
		Produto mel = new Produto("Mel Apiaris Premium");
		Produto arroz = new Produto("Arroz Brilhante 5kg");
		
		
		Pedido pedido01 = new Pedido(1);
		pedido01.adicionarItem(new ItemPedido(1, 6.75, omo));
		pedido01.adicionarItem(new ItemPedido(2, 15.00, mel));
		pedido01.adicionarItem(new ItemPedido(1, 15.00, mel));
		
		System.out.println(pedido01.getValorTotal()); //será impresso no console 36.75
	}

}
