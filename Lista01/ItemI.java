import java.util.Scanner;

public class ItemI {
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		int opcao;
		
		System.out.print("1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão");
		System.out.print("\n\nQual operação deseja realizar? ");
		opcao = reader.nextInt();
		
		switch(opcao) {
		case 1://Chama o método da SOMA;
			int a = 0;
			int b = 0;
			
			System.out.print("Informe o primeiro número: ");
			a = reader.nextInt();
			System.out.print("Informe o segundo número: ");
			b = reader.nextInt();
			
			System.out.println("Soma: " + soma(a,b));
			break;
		case 2://chama o método da SUBTRAÇÃO;
			int c = 0;
			int d = 0;
			
			System.out.print("Informe o primeiro número: ");
			c = reader.nextInt();
			System.out.print("Informe o segundo número: ");
			d = reader.nextInt();
			
			System.out.println("Subtração: " + subtracao(c,d));
			break;
		
		case 3://chama o método da MULTIPLICAÇÃO;
			int e = 0;
			int f = 0;
			
			System.out.print("Informe o primeiro número: ");
			e = reader.nextInt();
			System.out.print("Informe o segundo número: ");
			f = reader.nextInt();
			
			System.out.println("Multiplicação: " + multiplicacao(e,f));
			break;
		
		case 4://chama o método da DIVISÃO;
			double g = 0;
			double h = 0;
			
			System.out.print("Informe o primeiro número: ");
			g = reader.nextDouble();
			System.out.print("Informe o segundo número: ");
			h = reader.nextDouble();
			
			System.out.println("Divisão: " + divisao(g,h));
			break;
			
		default:
		}

	}
	public static int soma(int num1, int num2) {
		return num1 + num2;
	}
	public static int subtracao(int num1, int num2) {
		return num1 - num2;
	}
	public static int multiplicacao(int num1, int num2) {
		return num1 * num2;
	}
	public static double divisao(double num1, double num2) {
		return num1 / num2;
	}

}