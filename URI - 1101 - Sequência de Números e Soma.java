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

		boolean valido = true;
		while (valido) {
			int n1 = read.nextInt();
			int n2 = read.nextInt();
			int maior = Math.max(n1, n2);
			int menor = Math.min(n1, n2);
			int soma = 0;
			if(n1 > 0 && n2 > 0) {
				for(int i = menor; i <= maior; i++) {
					System.out.printf(i + " ");
					soma += i;
				}	
				System.out.println("Sum=" + soma);
			}else {
				valido = false;
			}	
		}
		read.close();
	}
}	

