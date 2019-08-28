package br.ufc.quixada.si.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Usuario {
	private String endereco;
	private LocalDate dataDeNascimento;
	private ArrayList<Produto> produtos;
	private CartaoDeCredito cartaoDeCredito;

	public Cliente() {

	}

	public Cliente(String nome, String email, String senha, String endereco, LocalDate dataDeNascimento,
			ArrayList<Produto> produtos, CartaoDeCredito cartaoDeCredito) {
		super(nome, email, senha);
		this.endereco = endereco;
		this.dataDeNascimento = dataDeNascimento;
		this.produtos = produtos;
		this.cartaoDeCredito = cartaoDeCredito;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public CartaoDeCredito getCartaoDeCredito() {
		return cartaoDeCredito;
	}

	public void setCartaoDeCredito(CartaoDeCredito cartaoDeCredito) {
		this.cartaoDeCredito = cartaoDeCredito;
	}

	@Override
	public String toString() {
		return "Cliente \nendereco: " + this.endereco + "\ndataDeNascimento: " + this.dataDeNascimento + "\nprodutos: "
				+ this.produtos + "\ncartaoDeCredito: " + this.cartaoDeCredito;
	}

}
