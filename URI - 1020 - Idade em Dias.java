import java.util.Scanner;
import java.lang.Math;


/*
 * Exercicio 1019
 * Conversão de tempo
 */

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int n = read.nextInt();

		int anos = n / 365;
		int meses = ((n % 365) / 30);
		int dias = (n % 365) % 30 ;
		
		System.out.println(String.format("%d ano(s)", anos));
		System.out.println(String.format("%d mes(es)", meses));
		System.out.println(String.format("%d dia(s)", dias));

	}
}
