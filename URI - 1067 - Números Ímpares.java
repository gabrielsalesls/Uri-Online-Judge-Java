import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1067
 * Números Impares
 */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		int numero = read.nextInt();
		for(int i = 1; i<=numero; i++) {
			if(!(i % 2 == 0)) {
				System.out.println(i);
			}
		}
		read.close();
	}
}

