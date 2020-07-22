import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1075
 * Resto 2
 */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		int maior = 0, posicao = 0, numero;
		
		for(int i = 1; i<=100;i++) {
			numero = read.nextInt();
			if(numero > maior) {
				maior = numero;
				posicao = i;
			}
		}
		
		System.out.println(maior);
		System.out.println(posicao);
		
		read.close();
	}
}
