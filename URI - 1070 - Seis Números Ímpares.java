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

		int numero = read.nextInt();
		int quantidadeImpar = 0;
		
		for(int i = numero; i<=numero+12; i++) {
			if(!(i % 2 == 0)) {
				quantidadeImpar++;
				if(quantidadeImpar <= 6) {
					System.out.println(i);
				}else {
					break;
				}
			}
		}
		read.close();
	}
}

