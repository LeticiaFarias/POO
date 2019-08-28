package br.ufc.quixada.si.poo.model;

import java.time.LocalDate;

public class ClientePessoaJuridica extends Cliente {
	private String cnpj;
	private LocalDate dataAbertura;
	
	public void ClientePessoaJuridica() {
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
}
