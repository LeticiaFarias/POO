package br.ufc.quixada.si.model;
import java.time.LocalDate;

public class Aluno extends Pessoa {
	private String matricula;

	public Aluno(String nome, String cpf, LocalDate dataNascimento, String matricula) {
		super(nome, cpf, dataNascimento);
		this.matricula = matricula;
	}
}
