import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1067
 * Números Impares
 */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		double numero, media, somaPositivos = 0;
		int numerosPositivos = 0;


		for(int i = 0; i <= 5; i++) {
			numero = read.nextDouble();
			if(numero > 0) {
				numerosPositivos++;
				somaPositivos += numero;
			}			
		}

		media = somaPositivos/numerosPositivos;
		System.out.println(numerosPositivos + " valores positivos");
		System.out.println(String.format("%.1f", media));
		read.close();
	}
}

