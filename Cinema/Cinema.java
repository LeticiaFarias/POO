package br.ufc.quixada.cinema;

public class Cinema {
	private String tituloDoFilme;
	private String horario;
	private String sala;
	private String poltrona;
	private double valorOriginal;
	private boolean disponivel;

	public Cinema() {
		this.tituloDoFilme = "A Seleção";
		this.horario = "15h00";
		this.sala = "03";
		this.poltrona = "01";
		this.valorOriginal = 30.00;
		this.disponivel = true;

	}

	public void calcularValorComDesconto(int dia, int mes, int ano) {
		int idade = 2018 - ano;

		if (idade < 12) {
			double desconto = this.valorOriginal * 0.5;
			this.valorOriginal = valorOriginal - desconto;
			System.out.println("Valor do desconto:R$ " + desconto);
		}
	}

	public void calcularValorComDesconto(int dia, int mes, int ano, int carteira) {
		int idade = 2018 - ano;

		if ((idade >= 12) && (idade <= 15) && (carteira != 0)) {
			double desconto = this.valorOriginal * 0.4;
			this.valorOriginal = valorOriginal - desconto;
			System.out.println("Valor do desconto .......... R$ " + desconto);
		} else if ((idade >= 16) && (idade <= 20) && (carteira != 0)) {
			double desconto = this.valorOriginal * 0.3;
			this.valorOriginal = valorOriginal - desconto;
			System.out.println("Valor do desconto .......... R$ " + desconto);
		} else if ((idade > 20) && (carteira != 0)) {
			double desconto = this.valorOriginal * 0.2;
			this.valorOriginal = valorOriginal - desconto;
			System.out.println("Valor do desconto .......... R$ " + desconto);
		}
		double desconto = 0;
		this.valorOriginal = valorOriginal - desconto;
		System.out.println("Valor final .......... R$ " + valorOriginal);
	}

	public boolean realizarVenda() {
		if (disponivel == true) {
			disponivel = false;
			System.out.println("Compra realizada");
		} else {
			System.out.println("Não foi possivel realizar a compra");
		}
		return disponivel;
	}

	public String getTituloDoFilme() {
		return tituloDoFilme;
	}

	public String getHorario() {
		return horario;
	}

	public String getSala() {
		return sala;
	}

	public String getPoltrona() {
		return poltrona;
	}

	public double getValorOriginal() {
		return valorOriginal;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public String toString() {
		return "\nCinEsquecidos \nFilme: " + tituloDoFilme + "\nHorário: " + horario + "\nSala: " + sala
				+ "\nPoltrona: " + poltrona + "\nValor Original: " + valorOriginal + "\nDisponivel: " + disponivel;
	}

}
