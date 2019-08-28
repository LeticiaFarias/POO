package br.ufc.quixada.si.exec;
import java.time.LocalDate;

import br.ufc.quixada.si.model.Pessoa;
import br.ufc.quixada.si.model.Funcionario;
import br.ufc.quixada.si.model.Aluno;
import br.ufc.quixada.si.model.ChefeDepartamento;

public class Principal {

	public static void main(String[] args) {
		LocalDate data = LocalDate.of(2018, 11, 21);
		Pessoa primeira_pessoa = new Pessoa("Marcus", "978546132", data);
		Funcionario primeiro_funcionario = new Funcionario("Hilderjares", "23154895", data, "231546", 2139.8, data);
		Aluno primeiro_aluno = new Aluno("Erica", "216549287", data, "987564");
		ChefeDepartamento primeiro_chefe = new ChefeDepartamento("Tercio", "213654878", data, "POO", 82561.2, data);
	
	
	}

}
