/*
 * Escreva uma fun��o que recebe duas notas como par�metro;
 * Retorna verdadeiro ou falso caso a m�dia tenha sido acima (ou igual) de 7, ou seja, conceito A.
 */

import java.util.Scanner;

public class ItemE {
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		int nota1;
		int nota2;
		
		System.out.print("Informe a primeira nota: ");
		nota1 = reader.nextInt();
		System.out.print("Informe a segunda nota: ");
		nota2 = reader.nextInt();
		System.out.print("M�dia: " + retornaMedia(nota1,nota2));

	}
	public static boolean retornaMedia(int nota1, int nota2) {
		if((nota1 + nota2) / 2 >= 7) {
			return true;
		}else {
			return false;
		}
	}
}
