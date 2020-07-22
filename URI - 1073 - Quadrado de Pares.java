import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1051
 * Imposto de Renda
 */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		int numeroCasos = read.nextInt();
		
		for(int i = 1; i<=numeroCasos; i++) {
			if(i % 2 == 0) {
				System.out.println(String.format("%d^2 = %d", i, (i*i)));
			}
		}
		
		read.close();
		
	}
}



