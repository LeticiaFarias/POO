package br.ufc.quixada.si.poo.model;

public abstract class Produto {
	private String codigo;
	private String nome;
	private String genero;
	private double preco;
	

	public Produto() {
		
	}

	public Produto(String codigo, String nome, String genero, double preco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.genero = genero;
		this.preco = preco;
	}

	public abstract void Executar();

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	@Override
	public String toString() {
		return "Produto \ncodigo=" + this.codigo + "\nnome=" + this.nome + "\ngenero=" + this.genero + "\npreco=" + this.preco;
	}
	
	
	
}
