import java.util.Scanner;

public class ItemI {
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		int opcao;
		
		System.out.print("1- Soma\n2- Subtra��o\n3- Multiplica��o\n4- Divis�o");
		System.out.print("\n\nQual opera��o deseja realizar? ");
		opcao = reader.nextInt();
		
		switch(opcao) {
		case 1://Chama o m�todo da SOMA;
			int a = 0;
			int b = 0;
			
			System.out.print("Informe o primeiro n�mero: ");
			a = reader.nextInt();
			System.out.print("Informe o segundo n�mero: ");
			b = reader.nextInt();
			
			System.out.println("Soma: " + soma(a,b));
			break;
		case 2://chama o m�todo da SUBTRA��O;
			int c = 0;
			int d = 0;
			
			System.out.print("Informe o primeiro n�mero: ");
			c = reader.nextInt();
			System.out.print("Informe o segundo n�mero: ");
			d = reader.nextInt();
			
			System.out.println("Subtra��o: " + subtracao(c,d));
			break;
		
		case 3://chama o m�todo da MULTIPLICA��O;
			int e = 0;
			int f = 0;
			
			System.out.print("Informe o primeiro n�mero: ");
			e = reader.nextInt();
			System.out.print("Informe o segundo n�mero: ");
			f = reader.nextInt();
			
			System.out.println("Multiplica��o: " + multiplicacao(e,f));
			break;
		
		case 4://chama o m�todo da DIVIS�O;
			double g = 0;
			double h = 0;
			
			System.out.print("Informe o primeiro n�mero: ");
			g = reader.nextDouble();
			System.out.print("Informe o segundo n�mero: ");
			h = reader.nextDouble();
			
			System.out.println("Divis�o: " + divisao(g,h));
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