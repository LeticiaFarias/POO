package br.ufc.quixada.si.poo.exec;


import java.time.LocalDate;

import br.ufc.quixada.si.poo.model.Cliente;
import br.ufc.quixada.si.poo.model.ClientePessoaFisica;
import br.ufc.quixada.si.poo.model.ClientePessoaJuridica;

public class PincipalImprimivel {

	public static void main(String[] args) {
		Cliente c1 = new ClientePessoaFisica();
		Cliente c2 = new ClientePessoaJuridica();
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
