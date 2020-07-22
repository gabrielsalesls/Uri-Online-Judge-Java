import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1041
 *
 */

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		int a = read.nextInt();
		int n = 0;
		int soma = 0;
		do {
			n = read.nextInt();

		}while(n <= 0);		
		
		for(int i = 0; i <= n-1; i++) {
			soma += a+(i);
		}
		
		System.out.println(soma);
		
		
		read.close();
	}
}


