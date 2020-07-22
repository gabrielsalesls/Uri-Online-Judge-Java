import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1133
 * Resto da Divisão
 */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		int x = read.nextInt();
		int y = read.nextInt();
		int maior = Math.max(x, y);
		int menor = Math.min(x, y);
		
		for(int i = menor+1; i <maior; i++) {
			if(i % 5 == 2 || i % 5 == 3) {
				System.out.println(i);
			}
		}
		
		read.close();
	}
}
