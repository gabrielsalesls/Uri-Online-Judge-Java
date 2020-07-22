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
		int numerosImpares = 0;
		int numerosPositivos = 0;
		int numerosNegativos = 0;

		while(cont <=4) {
			
			numero = read.nextInt();
			if(numero % 2 == 0) {
				numerosPares++;
			}else {
				numerosImpares++;
			}
			
			if(numero > 0) {
				numerosPositivos++;
			}else if(numero < 0) {
				numerosNegativos++;
			}
			
			cont++;
		}
		
		System.out.println(numerosPares + " valor(es) par(es)");
		System.out.println(numerosImpares + " valor(es) impar(es)");
		System.out.println(numerosPositivos + " valor(es) positivo(s)");
		System.out.println(numerosNegativos + " valor(es) negativo(s)");
		read.close();
	}
}

