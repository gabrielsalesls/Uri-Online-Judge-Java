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

		int numeroCaso = read.nextInt();
		double n1, n2, n3, media;
		
		for(int i = 0; i < numeroCaso; i++) {
			n1 = read.nextDouble() * 2;
			n2 = read.nextDouble() * 3;
			n3 = read.nextDouble() * 5;
			media = (n1+n2+n3)/10;
			System.out.println(String.format("%.1f", media));
		}
		read.close();
	}
}
