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

		int numeroCasos = read.nextInt();

		for(int y = 0; y < numeroCasos; y++) {

			read.nextLine();
			String	palavraDecifrar = read.nextLine();
			int troca = read.nextInt();
			char[] letra = palavraDecifrar.toCharArray();

			for(int i = 0; i<letra.length; i++) {
				if((letra[i] - troca) < 65)
					letra[i] += (26-troca);
				else
					letra[i] -= troca;
			}
			System.out.println(letra);
		}
		read.close();
	} 
}
