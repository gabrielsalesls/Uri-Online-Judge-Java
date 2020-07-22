import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1113
 *
 */

public class Main {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		read.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en","US"));

		boolean valido = true;
		while (valido) {
			int n1 = read.nextInt();
			int n2 = read.nextInt();
			
			if(n1 == n2) valido = false;
			else {
				if(n1 > n2)	System.out.println("Decrescente");
				else System.out.println("Crescente");
			}
		}
		read.close();
	}			
}
