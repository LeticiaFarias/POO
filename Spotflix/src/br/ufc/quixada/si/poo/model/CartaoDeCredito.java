package br.ufc.quixada.si.poo.model;

import java.time.LocalDate;

public class CartaoDeCredito {
	private String numero;
	private LocalDate validade;
	private int codigoCcv;
	private double limite;

	public CartaoDeCredito() {

	}

	public CartaoDeCredito(String numero, LocalDate validade, int codigoCcv, double limite) {
		super();
		this.numero = numero;
		this.validade = validade;
		this.codigoCcv = codigoCcv;
		this.limite = limite;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}

	public int getCodigoCcv() {
		return codigoCcv;
	}

	public void setCodigoCccv(int codigoCccv) {
		this.codigoCcv = codigoCccv;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "CartaoDeCredito \nnúmero: " + this.numero + "\nvalidade: " + this.validade + "\ncodigoCcv: "
				+ this.codigoCcv + "\nlimite: " + this.limite;
	}

}
