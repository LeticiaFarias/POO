package br.ufc.quixada.model;

public class Cliente {
	private String nome;
	private String cpf;

	public Cliente() {
		this.nome = "Tércio";
		this.cpf = "456.789.123-88";
		
	}
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {
		return cpf;
		
	}

	public void darNotaAoMotorista(Motorista motorista) {
		// TODO Auto-generated method stub
		
	}
	
	
}