package br.ufc.quixada.si.poo.model;

public abstract class Audio extends Produto {
	private String autor;
	private int duracao;

	public Audio() {

	}

	public Audio(String codigo, String nome, String genero, double preco, String autor, int duracao) {
		super(codigo, nome, genero, preco);
		this.autor = autor;
		this.duracao = duracao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "Audio \nautor: " + this.autor + "\nduracao: " + this.duracao;
	}

}
