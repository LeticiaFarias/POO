package br.ufc.quixada.si.poo.exec;


import br.ufc.quixada.si.poo.model.Cliente;
import br.ufc.quixada.si.poo.model.ClientePessoaFisica;
import br.ufc.quixada.si.poo.model.ClientePessoaJuridica;
import br.ufc.quixada.si.poo.model.Vendedor;

public class Principal {

	public static void main(String[] args) {
		
		Cliente c1 = new ClientePessoaFisica();
		Cliente c3 = new ClientePessoaJuridica();
		Vendedor v1 = new Vendedor();
		Vendedor v2 = new Vendedor();
		
		System.out.println(c1);
		System.out.println(c3);
		System.out.println(v1);
		System.out.println(v2);
	}
	public static void menu() {
		
	}

}
