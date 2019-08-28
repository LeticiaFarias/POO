/*
 * Uma função que não recebe nenhum parâmetro de entrada e retorna o seu nome;
 */
import java.util.Scanner;

public class ItemC {
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Nome: " + retornaNome());

	}
	public static String retornaNome() {
		String nome;
		
		System.out.print("Informe seu nome: ");
		nome = reader.nextLine();
		
		return nome;
	}
}
