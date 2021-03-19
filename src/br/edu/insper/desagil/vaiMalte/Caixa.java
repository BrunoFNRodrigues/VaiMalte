package br.edu.insper.desagil.vaiMalte;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	private Map<Integer, Integer> desconto;
	
	public Caixa() {
		super();
		this.desconto = new HashMap<>();
	}
	
	public void promocao(Produto produto, int codigo) {
		if (codigo>=1 && codigo<=99) {
			this.desconto.put(produto.getCodigo(), codigo);
		}
	}
	
	public int fazTotal(Carrinho car) {
		Produto produto = null;
		int res = 0;
		for (Pedido x: car.getPedidos()) {
			produto = x.getProduto();
			res = (int) (produto.getPreco() * x.getQuantidade()* this.desconto.get(produto.getCodigo()));
			res += res;
		}
		return res;
	}

}

