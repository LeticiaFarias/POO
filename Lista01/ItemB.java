/*
 * Uma fun��o que recebe dois n�meros inteiros como par�metro de entrada e retorna o menor dos n�meros;
 */
import java.util.Scanner;

public class ItemB {
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		int num1;
		int num2;
		
		System.out.print("Informe um número: ");
		num1 = reader.nextInt();
		System.out.print("Informe um número: ");
		num2 = reader.nextInt();
		
		System.out.print("Menor Número: " + retornaMenor(num1,num2));
	}
	public static int retornaMenor(int num1, int num2) {
		if(num1 < num2) {
			return num1;
		}else if(num2 < num1) {
			return num2;
		}else {
			return num1;
		}
	}
}
