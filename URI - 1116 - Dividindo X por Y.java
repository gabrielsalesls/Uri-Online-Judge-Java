import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1151
 * Fibonacci Fácil
 */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		int numeroLimite = read.nextInt();
		double x, y;
		
		for(int i = 0; i < numeroLimite; i++) {
			x = read.nextDouble();
			y = read.nextDouble();
			if(y == 0) {
				System.out.println("divisao impossivel");
			}else {
				System.out.println(String.format("%.1f", (x/y)));
			}
		}
		read.close();
	}
}