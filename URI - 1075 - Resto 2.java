import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1075
 * Resto 2
 */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		int n = read.nextInt();
		for(int x = 1; x<=10000; x++) {
			if(x % n == 2) {
				System.out.println(x);
			}
		}
		
		read.close();
	}
}
