package br.ufc.quixada.si.model;
import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private String cpf;
	private LocalDate dataNascimento;
	
	public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		
	}
}
