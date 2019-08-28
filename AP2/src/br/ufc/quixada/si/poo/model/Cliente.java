package br.ufc.quixada.si.poo.model;

public abstract class Cliente extends Pessoa {
	private String endereco;
	
	public void Cliente() {
		
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
