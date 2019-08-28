package br.ufc.quixada.si.poo.model;

public abstract class Video extends Produto {
	private int anoLancamento;
	private int faixaEtaria;

	public Video() {

	}

	public Video(String codigo, String nome, String genero, double preco, int anoLancamento, int faixaEtaria) {
		super(codigo, nome, genero, preco);
		this.anoLancamento = anoLancamento;
		this.faixaEtaria = faixaEtaria;

	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public int getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	@Override
	public String toString() {
		return "Video \nanoLancamento=" + this.anoLancamento + "\nfaixaEtaria=" + this.faixaEtaria;
	}

}
