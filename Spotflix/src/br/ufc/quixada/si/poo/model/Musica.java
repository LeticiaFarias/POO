package br.ufc.quixada.si.poo.model;

public class Musica extends Audio {
	private String album;

	public Musica() {

	}

	public Musica(String codigo, String nome, String genero, double preco, String autor, int duracao, String album) {
		super(codigo, nome, genero, preco, autor, duracao);
		this.album = album;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	@Override
	public void Executar() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Musica \nalbum: " + this.album;
	}

}
