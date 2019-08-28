import java.util.Scanner;

public class ItemJ {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
    	double safadeza;
    	double anjo;
    	
        System.out.println("Qual o dia de seu anivers�rio? ");
        int dia = reader.nextInt();
        System.out.println("Qual o m�s de seu aniversario? ");
        int mes = reader.nextInt();
        System.out.println("Qual o ano de seu nascimento? ");
        int ano = reader.nextInt();

        safadeza = (somatorio(mes) + (ano / 100) * (50-dia));
        anjo     = (1000 - safadeza);

        System.out.print("\n\nSeu n�vel de Safado �: " + (safadeza / 10) + "%");
        System.out.println("\nSeu n�vel de Anjo: " + (anjo / 10) + "%");
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