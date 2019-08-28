package br.ufc.quixada.exec;

import br.ufc.quixada.model.Cliente;
import br.ufc.quixada.model.Corrida;
import br.ufc.quixada.model.Motorista;

//Eu tenho até medo da merda que eu fiz nesse código
 
public class Principal {
	public static void main(String[] args) {
		Motorista motorista = new Motorista();
		Motorista motorista1 = new Motorista();
		Motorista motorista11 = new Motorista();
		Cliente cliente = new Cliente();
		Cliente cliente1 = new Cliente();
		Cliente cliente11 = new Cliente();
		Corrida corrida = new Corrida();
		Corrida corrida1 = new Corrida();
		Corrida corrida11 = new Corrida();
		

		motorista11.realizarCorrida(cliente11, corrida11);
		cliente11.darNotaAoMotorista(motorista11);
		corrida11.calcularValorCorrida(15);
		motorista11.realizarCorrida(cliente11, corrida11);
		cliente11.darNotaAoMotorista(motorista11);
		corrida11.calcularValorCorrida(15);
		motorista11.realizarCorrida(cliente11, corrida11);
		cliente11.darNotaAoMotorista(motorista11);
		corrida11.calcularValorCorrida(15);

		System.out.println(motorista11);
		System.out.println(cliente11);
		System.out.println(corrida11);

	}
}
