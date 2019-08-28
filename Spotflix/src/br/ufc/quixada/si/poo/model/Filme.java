package br.ufc.quixada.si.poo.model;

public class Filme extends Video {
	private int duracao;

	public Filme() {

	}

	public Filme(String codigo, String nome, String genero, double preco, int anoLancamento, int faixaEtaria,
			int duracao) {
		super(codigo, nome, genero, preco, anoLancamento, faixaEtaria);
		this.duracao = duracao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public void Executar() {

	}

	@Override
	public String toString() {
		return "Filme \nduracao: " + this.duracao;
		
	}

}
