package br.ufc.quixada.si.exec;

import br.ufc.quixada.si.model.Administrador;
import br.ufc.quixada.si.model.Empregado;
import br.ufc.quixada.si.model.Fornecedor;
import br.ufc.quixada.si.model.Operario;
import br.ufc.quixada.si.model.Pessoa;
import br.ufc.quixada.si.model.Vendedor;

public class Principal {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Marcus", "Rua das POCs", 246965465);
		Fornecedor f1 = new Fornecedor("Terção da Massa", "Rua SI", 798546132, 2000, 200);
		Empregado e1 = new Empregado("Ìndio pantoja", "PET-SI", 987132, 5, 400);
		Administrador ad1 = new Administrador("Erica", "Capitalistas Opressores", 78126532, 4, 10000, 500);
		Operario op1 = new Operario("Maaaax", "Sem teto", 463465416, 1, 1500, 700);
		Vendedor v1 = new Vendedor("Lucivan", "Bundonas", 40028922, 63, 4000, 500);

		System.out.println(p1.toString());
		System.out.println(f1.toString() + f1.obterSaldo());
		System.out.println(e1.toString() + e1.calcularSalario());
		System.out.println(ad1.toString() + ad1.calcularSalario());
		System.out.println(op1.toString() + op1.calcularSalario());
		System.out.println(v1.toString() + v1.calcularSalario());

	}

}
