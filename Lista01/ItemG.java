/*
 *Escreva uma fun��o que recebe um inteiro n e retorna verdadeiro se o n�mero for primo;
 *E falso caso contr�rio.
 */
import java.util.Scanner;

public class ItemG {
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		int numero;
		
		System.out.print("Informe um n�mero: ");
		numero = reader.nextInt();
		
		System.out.print("Esse n�mero � primo? " + ehPrimo(numero));

	}
	public static boolean ehPrimo(int numero) {
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				return false;
			}
		}
		if(numero == 1) {
			return false;
		}
		return true;
	}
}