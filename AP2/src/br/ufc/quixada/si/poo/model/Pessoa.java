package br.ufc.quixada.si.poo.model;

public abstract class Pessoa {
	private String nome;

	public Pessoa() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	
}
