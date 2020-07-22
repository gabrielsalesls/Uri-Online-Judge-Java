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
		
		for(int x = 1; x<=10; x++) {
			System.out.println(String.format("%d x %d = %d", x, n, (x*n)));
			}
		
		read.close();
		}	
	}
