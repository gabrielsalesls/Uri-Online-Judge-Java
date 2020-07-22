import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;


/*
 * Exercicio 1059
 * Números Pares
 */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		double numero;
		int cont = 0;
		int numerosPositivos = 0;

		while(cont <=5) {
			numero = read.nextDouble();
			if(numero > 0) {
				numerosPositivos++;
			}
			cont++;
		}
		
		System.out.println(numerosPositivos + " valores positivos");
	}
}

