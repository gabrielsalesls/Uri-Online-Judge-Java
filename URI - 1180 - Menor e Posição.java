import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1253
 *
 */

public class Main {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		read.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en","US"));

		int numeroElementos = read.nextInt();
		int[] lista = new int[numeroElementos];
		int menor = 0, posicaoMenor = 0;

		for(int i = 0; i < numeroElementos; i++) {

			lista[i] = read.nextInt();
			if(i == 0) {
				menor = lista[i];
				posicaoMenor = i;
			}else if(lista[i] < menor) {
				menor = lista[i];
				posicaoMenor = i;
				
			}
		}
		
		System.out.println(String.format("Menor valor: %d", menor));
		System.out.println(String.format("Posicao: %d", posicaoMenor));
		
		read.close();
	}	
} 
