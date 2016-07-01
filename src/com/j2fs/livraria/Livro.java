package com.j2fs.livraria;

public class Livro implements Promocional{
	
	String nome;
	String decricao;
	double valor;
	String isbn;
	public String getNome() {
		return nome;
	}
	
	public Livro(String nome) {
		this();
		this.nome = nome;
	}
	public Livro(){
		this.isbn = "00-000-000-000";
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDecricao() {
		return decricao;
	}
	public void setDecricao(String decricao) {
		this.decricao = decricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public boolean aplicarDescontoDe(double pocentagem) {
		// TODO Auto-generated method stub
		return false;
	}

}
