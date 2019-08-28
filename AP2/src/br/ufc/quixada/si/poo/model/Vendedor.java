package br.ufc.quixada.si.poo.model;

public class Vendedor extends Funcionario{
	public void Vendedor() {
		
	}
	
	public void realizarVenda(float valorContrato) {
		salarioVendedor = salarioVendedor + (valorContrato * 0.5);
		
	}
	
}
