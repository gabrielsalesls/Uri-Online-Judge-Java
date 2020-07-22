import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1132
 * Múltiplos de 13
 */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		String[] meses = {"January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October",
				"November", "December"};
		
		int mes = read.nextInt();
		System.out.println(meses[mes-1]);
		
		read.close();
		
	}
}



