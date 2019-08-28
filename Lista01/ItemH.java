/*
 * Fazendo uso da função da questão (2);
 * Faça um programa que recebe as duas notas do aluno, calcula se ele passou com conceito A;
 * caso contrário, aplica prova final;
 * Uma vez aplicada prova final, calcule novamente se o aluno passou com conceito B ou foi reprovado.
 */
import java.util.Scanner;

public class ItemH {
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		int nota1;
		int nota2;
		
		System.out.print("Informe a primeira nota: ");
		nota1 = reader.nextInt();
		System.out.print("Informe a segunda nota: ");
		nota2 = reader.nextInt();
		
		mediaProvas(nota1, nota2);
	}
	public static void mediaProvas(double nota1, double nota2) {
		double AF;
		
		if((nota1 + nota2) / 2 >= 7.0) {
			System.out.println("Aprovado por conceito A.");
		}else if ((nota1 + nota2) / 2 >= 4.0){
			System.out.print("\nNota insuficiente! Necessita da Avaliação Final.");
			System.out.print("\nInforme a nota da avaliação final: ");
			AF = reader.nextDouble();
			if(AF < 4.0) {
				System.out.println("\nReprovado");
			}else if(AF > 4.0) {
				if((((nota1 + nota2) + AF) / 2) > 4){
					System.out.println("Aprovado por conceito B.");
				}else {
					System.out.println("Reprovado por conceito B.");
				}
			}
		}else {
			System.out.println("Reprovado por nota.");
		}
	}

}