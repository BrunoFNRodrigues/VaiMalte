package br.edu.insper.desagil.vaiMalte;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Pedido> pedidos;

	public Carrinho() {
		super();
		this.pedidos = new ArrayList<>();
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	public void carrinho(Produto produto) {
		if (pedidos.contains(produto)) {
			Pedido pedido = null;
			pedido.incremento();			
		}
		else {
			Pedido pedido = new Pedido(produto);
			this.pedidos.add(pedido);
		}
	}
	

	
}
