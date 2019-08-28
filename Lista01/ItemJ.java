import java.util.Scanner;

public class ItemJ {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
    	double safadeza;
    	double anjo;
    	
        System.out.println("Qual o dia de seu aniversário? ");
        int dia = reader.nextInt();
        System.out.println("Qual o mês de seu aniversario? ");
        int mes = reader.nextInt();
        System.out.println("Qual o ano de seu nascimento? ");
        int ano = reader.nextInt();

        safadeza = (somatorio(mes) + (ano / 100) * (50-dia));
        anjo     = (1000 - safadeza);

        System.out.print("\n\nSeu nível de Safado é: " + (safadeza / 10) + "%");
        System.out.println("\nSeu nível de Anjo: " + (anjo / 10) + "%");
    }
    public static int somatorio(int num){
    	int i = num - 1;
		
		while (i > 0){
			num = num + i;
			i--;
		}
		return num;	
	} 	    
}