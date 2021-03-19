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
	    return false;
	}

	public boolean testeD() {
	    return false;
	}

	public boolean testeE() {
	    return false;
	}
	
}
