package br.edu.insper.desagil.vaiMalte;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	private Map<Produto, Integer> desconto;
	
	public Caixa() {
		super();
		this.desconto = new HashMap<>();
	}
	
	public void promocao(Produto produto, int codigo) {
		if (codigo>=1 && codigo<=99) {
			this.desconto.put(produto, codigo);
		}
	}
	
	public int fazTotal(Carrinho car) {
		int res = 0;
		int total = 0;
		int des = 0;
		for (Pedido x: car.getPedidos()) {
			Produto produto = x.getProduto();
			if (this.desconto.get(produto) == null){
				res = (int) (produto.getPreco() * x.getQuantidade());
				total += res;
			}
			else {
				des = (this.desconto.get(produto));
				res = (int) (produto.getPreco() * x.getQuantidade()- produto.getPreco() * x.getQuantidade()*des/100);
				total += res;
			}
		}
		return total;
	}

}
