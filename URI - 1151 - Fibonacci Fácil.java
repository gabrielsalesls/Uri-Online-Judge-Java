import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1151
 * Fibonacci Fácil
 */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		long anteiror = 0;
		long atual = 1;
		long soma = 0;

		int limite = read.nextInt();

		for(int i = 1; i <= limite; i++) {
			
			
			if(i != limite) {
				System.out.print(soma + " ");
				soma = anteiror + atual;
				atual = anteiror;
				anteiror = soma;
			}else {
				System.out.println(soma);
			}
		}
		read.close();
	}
}
