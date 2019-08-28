/*
 * Uma função que não recebe nenhum parâmetro de entrada e nem retorna nada. 
 * Apenas escreve o seu nome 100 vezes na tela;
 * Intercalado com o seu sobrenome (a cada iteração, escreva um ou outro).
 */
import java.util.Scanner;

public class ItemD {
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		retornaCemNomes();

	}
	public static void retornaCemNomes() {
		String  nome;
		String  sobrenome;
		int     i;
		
		System.out.print("Informe seu nome: ");
		nome = reader.nextLine();
		System.out.print("Informe seu sobrenome: ");
		sobrenome = reader.nextLine();
		
		for(i = 0; i < 100; i++) {
			if(i % 2 == 0) {
				System.out.println(nome);
			}else {
				System.out.println(sobrenome);
			}
		}
	}
}
