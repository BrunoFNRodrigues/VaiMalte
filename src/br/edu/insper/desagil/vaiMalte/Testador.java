package br.edu.insper.desagil.vaiMalte;

public class Testador {
	public boolean testeA() {
		int res;
		Produto produto = new Produto(0, null, 0);
		Carrinho carr = new Carrinho();
		carr.carrinho(produto);
		Caixa caixa = new Caixa();
		res = caixa.fazTotal(carr);
		if (res == 0) {
			return true;
		}
	    return false;
	}

	public boolean testeB() {
		int res;
		Produto produto = new Produto(5, "Cevada", 8.00);
		Carrinho carr = new Carrinho();
		carr.carrinho(produto);
		Caixa caixa = new Caixa();
		res = caixa.fazTotal(carr);
		if (res == 8) {
			return true;
		}
	    return false;
	}

	public boolean testeC() {
		int res;
		Produto produto = new Produto(5, "Cevada", 8.00);
		Carrinho carr = new Carrinho();
		carr.carrinho(produto);
		Caixa caixa = new Caixa();
		caixa.promocao(produto, 10);
		res = caixa.fazTotal(carr);
		if (res == 7) {
			return true;
		}
	    return false;
	}

	public boolean testeD() {
		int res;
		Produto produto = new Produto(5, "Cevada", 8.00);
		Produto produto2 = new Produto(6, "Malte", 12.20);
		Carrinho carr = new Carrinho();
		carr.carrinho(produto);
		carr.carrinho(produto2);
		carr.carrinho(produto2);
		Caixa caixa = new Caixa();
		caixa.promocao(produto, 10);
		res = caixa.fazTotal(carr);
		if (res == 31) {
			return true;
		}
	    return false;
	}

	public boolean testeE() {
		int res;
		Produto produto = new Produto(5, "Cevada", 8.00);
		Produto produto2 = new Produto(6, "Malte", 12.20);
		Carrinho carr = new Carrinho();
		carr.carrinho(produto);
		carr.carrinho(produto);
		carr.carrinho(produto2);
		Caixa caixa = new Caixa();
		caixa.promocao(produto2, 10);
		res = caixa.fazTotal(carr);
		if (res == 26) {
			return true;
		}
	    return false;
	}
	
}
