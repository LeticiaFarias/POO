package br.ufc.quixada.si.model;
import java.time.LocalDate;

public class Funcionario extends Pessoa{
	private String matricula;
	private double salario;
	private LocalDate dataAdmissao;
	
	public Funcionario(String nome, String cpf, 
			LocalDate dataNascimento, 
			String matricula, 
			double salario,
			LocalDate dataAdmissao) {
		
		super(nome, cpf, dataNascimento);
		this.matricula = matricula;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}
}
