package br.edu.insper.desagil.vaiMalte;

public class Produto {
	private int codigo;
	private String nome;
	private double preco;
	
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public Produto(int codigo, String nome, double preco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}
		
}
