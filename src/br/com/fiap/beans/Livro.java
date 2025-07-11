package br.com.fiap.beans;

/**
 * Representa um livro no sistema de vendas
 */

public class Livro {

	// Titulo 
	private String titulo;
	
	//Autor
	private String autor;
	
	//genero
	private String genero; 
	
	//preco
	private double preco;
	
	//isbn(identificador)
	private String isbn;

	//quantidade em estoque
	private int quantidade;
	
	
	//construtor vazio
	public Livro() {
		super();
	}



    //construtor cheio
	public Livro(String titulo, String autor, String genero, double preco, String isbn, int quantidade) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.preco = preco;
		this.isbn = isbn;
		this.quantidade = quantidade;
	}
	
	
	
   //getters and setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	
}
