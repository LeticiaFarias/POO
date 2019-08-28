package br.ufc.quixada.cinema;

import java.util.Scanner;

public class EntradaDeCinema {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		// Entrada do teclado

		System.out.println("Dados do cliente \nData de Nascimento ");
		System.out.println("Dia: ");
		int dia = Integer.parseInt(in.nextLine());
		System.out.println("Mês: ");
		int mes = Integer.parseInt(in.nextLine());
		System.out.println("Ano: ");
		int ano = Integer.parseInt(in.nextLine());
		System.out.println("Numero da carteira de estudante: ");
		int carteira = Integer.parseInt(in.nextLine());

		Cinema cliente = new Cinema();
		cliente.calcularValorComDesconto(dia, mes, ano);
		cliente.calcularValorComDesconto(dia, mes, ano, carteira);
		cliente.realizarVenda();
		System.out.println(cliente);

	}

}
