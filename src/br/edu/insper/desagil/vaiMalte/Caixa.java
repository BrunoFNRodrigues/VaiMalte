package br.edu.insper.desagil.vaiMalte;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	private Map<Integer, Integer> desconto;
	private int codigo;
	private Produto produto;
	
	public Carrinho(int codigo, Produto produto) {
		super();
		this.desconto = new HashMap<>();
		this.codigo = codigo;
		this.produto = produto;
	}
	
	public void promocao(Produto produto, int codigo) {
		if (codigo>=1 && codigo<=99) {
			this.desconto.put(produto.getCodigo(), codigo);
		}
	}
	
	public int fazTotal(Carrinho car) {
		Produto produto = null;
		int res = 0;
		for (Pedido x: car) {
			produto = x.getProduto()
			res = produto.getPreco() * x.getContidade
			res += res;
		}
		return res;
	}
}
