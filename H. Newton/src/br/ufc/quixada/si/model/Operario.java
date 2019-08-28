package br.ufc.quixada.si.model;

public class Operario extends Empregado {
	private double valorProducao;
	private double comissao;

	public Operario(String nome, String endereco, int telefone, int codigoSetor, double salarioBase,
			double valorProducao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase);
		this.valorProducao = valorProducao;
		this.comissao = valorProducao * 0.3;
	}

	public double calcularSalario() {
		return super.calcularSalario() + this.comissao;
	}

	@Override
	public String toString() {
		return "Operario [valorProducao=" + valorProducao + ", comissao=" + comissao + "]";
	}

}
