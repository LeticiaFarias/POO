package br.ufc.quixada.si.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pacote extends Produto {
	private double precoMensal;
	private LocalDate validade;
	private ArrayList<Produto> produtos;
	
	//FALTA COISA
	
	public Pacote() {

	}

	public Pacote(String codigo, String nome, String genero, double preco, double precoMensal, LocalDate validade,
			ArrayList<Produto> produtos) {
		super(codigo, nome, genero, preco);
		this.precoMensal = precoMensal;
		this.validade = validade;
		this.produtos = produtos;
	}

	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}

	public double getPrecoMensal() {
		return precoMensal;
	}

	public void setPrecoMensal(double precoMensal) {
		this.precoMensal = precoMensal;
	}

	@Override
	public void Executar() {
		

	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "Pacote \nprecoMensal: " + this.precoMensal + "\nvalidade: " + this.validade + "\nprodutos: "
				+ this.produtos;
	}

}
