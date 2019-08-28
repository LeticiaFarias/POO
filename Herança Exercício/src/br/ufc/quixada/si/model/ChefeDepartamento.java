package br.ufc.quixada.si.model;
import java.time.LocalDate;

public class ChefeDepartamento extends Funcionario{
	private String departamento;
	private double gratificacao;
	private LocalDate dataPromocao;
	
	public ChefeDepartamento(String nome, String cpf, LocalDate dataNascimento, String departamento,
			double gratificacao, LocalDate dataPromocao) {
		super(nome, cpf, 
				dataNascimento,  matricula, 
				salario, dataAdmissao);
		this.departamento = departamento;
		this.gratificacao = gratificacao;
		this.dataPromocao = dataPromocao;
	}
}
