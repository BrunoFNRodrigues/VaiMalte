package br.edu.insper.desagil.vaiMalte;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProdutoTest {
	private Produto produto;

	@BeforeEach
	public void setUp() {
		produto = new Produto(5, "Cevada", 8.00);
	}

	@Test
	public void testConstructor() {
		assertEquals(5, produto.getCodigo());
		assertEquals("Cevada", produto.getNome());
		assertEquals(8.00, produto.getPreco());
	}

}
