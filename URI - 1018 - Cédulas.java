import java.util.Scanner;
import java.lang.Math;


/*
 * Exercicio 1018
 * Cédulas
 */

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int n = read.nextInt();

		int notasDe100 = Math.abs(n/100);
		int resto = n % 100;

		int notasDe50 = Math.abs(resto/50);
		resto = resto % 50;

		int notasDe20 = Math.abs(resto/20);
		resto = resto % 20;
		
		int notasDe10 = Math.abs(resto/10);
		resto = resto % 10;
		
		int notasDe5 = Math.abs(resto/5);
		resto = resto % 5;
		
		int notasDe2 = Math.abs(resto/2);
		resto = resto % 2;
		
		int notasDe1 = resto;
		
		System.out.println(n);
		System.out.println(String.format("%d nota(s) de R$ 100,00", notasDe100));
		System.out.println(String.format("%d nota(s) de R$ 50,00", notasDe50));
		System.out.println(String.format("%d nota(s) de R$ 20,00", notasDe20));
		System.out.println(String.format("%d nota(s) de R$ 10,00", notasDe10));
		System.out.println(String.format("%d nota(s) de R$ 5,00", notasDe5));
		System.out.println(String.format("%d nota(s) de R$ 2,00", notasDe2));
		System.out.println(String.format("%d nota(s) de R$ 1,00", notasDe1));

	}
}
