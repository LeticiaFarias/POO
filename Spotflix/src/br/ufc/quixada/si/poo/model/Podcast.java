package br.ufc.quixada.si.poo.model;

public class Podcast extends Audio {
	private String tematica;

	public Podcast() {

	}

	public Podcast(String codigo, String nome, String genero, double preco, String autor, int duracao,
			String tematica) {
		super(codigo, nome, genero, preco, autor, duracao);
		this.tematica = tematica;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	@Override
	public void Executar() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Podcast \ntematica: " + this.tematica;
	}

}
