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

		int horas = n / 3600;
		int minutos = ((n % 3600) / 60);
		int segundos = n % 60;

		System.out.println(String.format("%d:%d:%d", horas, minutos, segundos));


	}
}
