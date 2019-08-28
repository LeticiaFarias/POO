package br.ufc.quixada.si.poo.model;

public abstract class Funcionario extends Usuario {
	private String matricula;
	private double salario;

	public Funcionario() {

	}

	public Funcionario(String nome, String email, String senha, String matricula, double salario) {
		super(nome, email, senha);
		this.matricula = matricula;
		this.salario = salario;

	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario \nmatricula: " + this.matricula + "\nsalario: " + this.salario;
	}

}
