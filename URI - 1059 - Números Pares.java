import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;


/*
 * Exercicio 1059
 * Números Pares
 */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		for(int i = 1; i<=100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
	}
}

