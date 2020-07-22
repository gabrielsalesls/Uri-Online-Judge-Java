import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1059
 * Números Pares
 */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		int numero;
		int cont = 0;
		int numerosPares = 0;

		while(cont <=4) {
			numero = read.nextInt();
			if(numero % 2 == 0) {
				numerosPares++;
			}
			cont++;
		}
		
		System.out.println(numerosPares + " valores pares");
	}
}

