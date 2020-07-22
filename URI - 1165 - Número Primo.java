import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1165
 *
 */

public class Main {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		read.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en","US"));

		int numeroCasos = read.nextInt();

		for(int i = 0; i < numeroCasos; i++) {
			int num = read.nextInt();
			boolean ehPrimo = false;
			for(int x = 2; x < num; x++) {
				if(num % x == 0) {
					ehPrimo = true;
					break;
				}
			}
			if(ehPrimo)
				System.out.println(String.format("%d nao eh primo", num));
			else
				System.out.println(String.format("%d eh primo", num));
		}
		read.close();
	}
}	

