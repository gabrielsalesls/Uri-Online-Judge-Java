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

		int numero1 = read.nextInt();
		int numero2 = read.nextInt();
		int maior = Math.max(numero1, numero2);
		int menor = Math.min(numero1, numero2); 
		int somaImpares = 0;
		
		for(int i = menor+1; i < maior; i++) {
			if(!(i%2==0)) {
				somaImpares += i;
			}
		}
		System.out.println(somaImpares);
		read.close();
	}
}

