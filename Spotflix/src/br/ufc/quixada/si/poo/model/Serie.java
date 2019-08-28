package br.ufc.quixada.si.poo.model;

public class Serie extends Video {
	private int numeroDeEpisodios;
	private int duracaoMediaDeEpisodios;

	public Serie() {

	}

	public Serie(String codigo, String nome, String genero, double preco, int anoLancamento, int faixaEtaria,
			int numeroDeEpisodios, int duracaoMediaDeEpisodios) {
		super(codigo, nome, genero, preco, anoLancamento, faixaEtaria);
		this.duracaoMediaDeEpisodios = duracaoMediaDeEpisodios;
		this.numeroDeEpisodios = numeroDeEpisodios;

	}

	public int getNumeroDeEpisodios() {
		return numeroDeEpisodios;
	}

	public void setNumeroDeEpisodios(int numeroDeEpisodios) {
		this.numeroDeEpisodios = numeroDeEpisodios;
	}

	public int getDuracaoMediaDeEpisodios() {
		return duracaoMediaDeEpisodios;
	}

	public void setDuracaoMediaDeEpisodios(int duracaoMediaDeEpisodios) {
		this.duracaoMediaDeEpisodios = duracaoMediaDeEpisodios;
	}

	@Override
	public String toString() {
		return "Serie  \nnumeroDeEpisodios: " + this.numeroDeEpisodios + "\nduracaoMediaDeEpisodios: "
				+ this.duracaoMediaDeEpisodios;
	}

	@Override
	public void Executar() {
		
		
	}

}
