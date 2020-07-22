import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1168
 * LED
 */

public class Main {

	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		int soma, tamanho;
		String numero;
		
		int numeroCasos = read.nextInt();

		for(int i = 0; i<numeroCasos;i++) {
			soma = 0;
			numero = read.next();
			tamanho = numero.length();
			for(int x = 0; x < tamanho; x++) {
				char numTexto = numero.charAt(x);
				int numInt = Character.getNumericValue(numTexto);
				switch(numInt) {
				case 1:
					soma += 2;
					break;
				case 2:
				case 3:
				case 5:
					soma += 5;
					break;
				case 4:
					soma += 4;
					break;
				case 6:
				case 9:
				case 0:
					soma += 6;
					break;
				case 7:
					soma += 3;
					break;
				case 8:
					soma += 7;
					break;
				}
			}		System.out.println(soma + " leds");

		}
		
		read.close();
	}
}
