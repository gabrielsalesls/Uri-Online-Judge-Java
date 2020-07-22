import java.util.Scanner;
import java.lang.Math;


/*
 * Exercicio 1035
 * Teste de Seleção
 */

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int a = read.nextInt();
		int b = read.nextInt();
		int c = read.nextInt();
		int d = read.nextInt();
		
		if(b > c & d > a & (c + d) > (a + b) & c > 0 & d > 0 & a % 2 == 0) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}
	}
}
