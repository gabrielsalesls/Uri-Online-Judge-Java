import java.util.Scanner;

/*
 * Exercicio 1157
 * Divisores I
 */

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		
		for(int i = 1; i<=n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		
		read.close();
	}
}