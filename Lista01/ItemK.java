/*
 * Implemente uma função que recebe dois parâmetros de entrada e retorna o seguinte:
 * "AZUL", se ambos os números forem pares;
 * "VERMELHO", se ambos os números forem ímpares;
 * "AMARELO", se um número for par e outro ímpar.
 */

import java.util.Scanner;

public class ItemK {
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		int num1;
		int num2;
		
		System.out.print("Informe um número: ");
		num1 = reader.nextInt();
		System.out.print("Informe outro número: ");
		num2 = reader.nextInt();
		
		verificaNumeros(num1,num2);

	}
	public static void verificaNumeros(int num1, int num2) {
		if(num1 % 2 == 0 && num2 % 2 == 0) {
			System.out.println("AZUL");
		}else if(num1 % 2 != 0 && num2 % 2 != 0) {
			System.out.println("VERMELHO");
		}else if((num1 % 2 == 0 && num2 % 2 != 0) || (num1 % 2 != 0 && num2 % 2 == 0)) {
			System.out.println("AMARELO");
		}
	}

}