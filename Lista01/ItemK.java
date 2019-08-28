/*
 * Implemente uma fun��o que recebe dois par�metros de entrada e retorna o seguinte:
 * "AZUL", se ambos os n�meros forem pares;
 * "VERMELHO", se ambos os n�meros forem �mpares;
 * "AMARELO", se um n�mero for par e outro �mpar.
 */

import java.util.Scanner;

public class ItemK {
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		int num1;
		int num2;
		
		System.out.print("Informe um n�mero: ");
		num1 = reader.nextInt();
		System.out.print("Informe outro n�mero: ");
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