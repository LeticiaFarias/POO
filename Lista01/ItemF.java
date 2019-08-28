/*
 * Escreva uma função que recebe um inteiro n e retorna o fatorial de n.
 */
import java.util.Scanner;

public class ItemF {
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		int numero;
		
		System.out.print("Informe um número: ");
		numero = reader.nextInt();
		
		System.out.print("Fatorial: " + retornaFatorial(numero));

	}
	public static int retornaFatorial(int numero) {
		int i = numero - 1;
		
		while (i > 0){
			numero = numero * i;
			i--;
		}
		return numero;	
	}

}