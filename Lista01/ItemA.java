/*
 * Uma fun��o que recebe dois n�meros inteiros como par�metro de entrada e retorna o maior dos n�meros;

 */
import java.util.Scanner;

public class ItemA {
		public static Scanner reader = new Scanner(System.in);
		public static void main(String[] args) {
			int num1;
			int num2;
			
			System.out.print("Informe um n�mero: ");
			num1 = reader.nextInt();
			System.out.print("Informe um n�mero: ");
			num2 = reader.nextInt();
			
			System.out.print("Maior n�mero: " + retornaMaior(num1,num2));
		}
		public static int retornaMaior(int num1, int num2) {
			if(num1 > num2) {
				return num1;
			}else if(num2 > num1) {
				return num2;
			}else {
				return num1;
			}
		}
}


