//import java.util.Locale;
//import java.util.Scanner;

/*
 * Exercicio 1155
 * Sequência S
 */

public class Main {

	public static void main(String[] args) {
	//	Locale.setDefault(Locale.US);

		double s = 0;
		
		for(int i = 1; i <= 100; i++) {
			s += 1.0 / i;
		}
		
		System.out.println(String.format("%.2f", s));
	}
}