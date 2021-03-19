package br.edu.insper.desagil.vaiMalte;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	private Map<String, Integer> desconto;
	
	public Caixa() {
		super();
		this.desconto = new HashMap<>();
	}
	
	public void promocao(Produto produto, int codigo) {
		if (codigo>=1 && codigo<=99) {
			this.desconto.put(produto.getNome(), codigo);
		}
	}
	
	public int fazTotal(Carrinho car) {
		int res = 0;
		int total = 0;
		int des = 0;
		for (Pedido x: car.getPedidos()) {
			Produto produto = x.getProduto();
			if (this.desconto.get(produto.getNome()) == null){
				res = (int) (produto.getPreco() * x.getQuantidade());
				total += res;
			}
			else {
				des=desconto.get(produto.getNome())/100;
				res = (int) (produto.getPreco() * x.getQuantidade()-des);
				total+=res;
			}
		}
		return total;
	}

}
