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
		
		int x = read.nextInt();
		int y = read.nextInt();
		int soma = x, cont = 1;
		
		while(y <= x) {
			y = read.nextInt();
		}
		
		for(int i = x+1; i <= y; i++) {
			cont++;
			soma += i;
			if(soma > y) {
				break;
			}
		}
		
		System.out.println(cont);
		
		read.close();
	}
}


