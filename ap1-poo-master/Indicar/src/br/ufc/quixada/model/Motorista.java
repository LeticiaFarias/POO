package br.ufc.quixada.model;

public class Motorista {
	private String nome;
	private String cnh;
	private String placa;
	private float nota;
	
	public Motorista() {
		this.nome = "Marcus";
		this.cnh = "87456132";
		this.placa = "POC/n1010";
		this.nota = 69.0f;
		
	}
	
	public Motorista(String nome, String cnh, String placa, float nota) {
		this.nome = nome;
		this.cnh = cnh;
		this.placa = placa;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
	
	public void realizarCorrida(Cliente cliente, Corrida corrida) {
		
		
	}

	
}
