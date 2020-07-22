import java.util.Scanner;

/*
 * Exercicio 1153
 * Fatorial Simples
 */

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		int fatorial = 1;
		
		for(int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		
		System.out.println(fatorial);
	}
}