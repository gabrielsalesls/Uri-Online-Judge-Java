import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1143
 * Quadrado e ao Cubo
 */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		int n = read.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println(String.format("%d %d %d", i, (i*i), (i*i*i)));
		}
			
		read.close();
	}
}