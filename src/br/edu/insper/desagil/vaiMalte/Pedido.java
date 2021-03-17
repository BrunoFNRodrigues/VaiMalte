package br.edu.insper.desagil.vaiMalte;

public class Pedido {
	private int quantidade;
	private Produto produto;
	
	public Pedido(Produto produto) {
		super();
		this.quantidade = 1;
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}

	public Produto getProduto() {
		return produto;
	}
	
	public void incremento(Produto produto) {
		if (Carrinho.getPedidos().contains(produto)) {
			this.quantidade+=1;
		}
	}
	
	public double total(Produto produto) {
		return this.quantidade*produto.getPreco();
	}
		
}
