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

		int x = read.nextInt();
		int y = read.nextInt();
		int soma = 0;

		if(x > y) {
			for(int i = y; i<=x; i++) {
				if(i % 13 != 0) {
					soma += i;
				}
			}
		}else {
			for(int i=x; i<=y; i++) {
				if(i % 13 != 0) {
					soma += i;
				}
			}
		}
		System.out.println(soma);
	}		
}



