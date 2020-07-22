import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1132
 * Múltiplos de 13
 */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		int numeroCasos = read.nextInt();
		int dentro = 0, fora = 0;
		int numero;

		for(int i = 0; i < numeroCasos; i++) {
			numero = read.nextInt();
			if(numero >= 10 && numero <= 20) {
				dentro++;
			}else {
				fora++;
			}
		}
		
		System.out.println(dentro + " in");
		System.out.println(fora + " out");
		read.close();
	}
}



