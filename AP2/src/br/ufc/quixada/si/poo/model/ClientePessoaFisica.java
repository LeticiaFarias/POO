package br.ufc.quixada.si.poo.model;

import java.time.LocalDate;

public class ClientePessoaFisica extends Cliente {
	private String cpf;
	private LocalDate dataNascimento;

	public ClientePessoaFisica() {
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "ClientePessoaFisica [cpf=" + cpf + ", dataNascimento=" + dataNascimento + "]";
	}

}
