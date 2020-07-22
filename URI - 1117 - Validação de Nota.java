import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1117
 * Validação de Nota
 */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		double n, numerosValidos = 0, soma = 0;
		
		do {
			n = read.nextDouble();
			if(n >= 0 && n <= 10) {
				soma += n;
				numerosValidos ++;
			}else
			{
				System.out.println("nota invalida");
			}
			
		}while(numerosValidos != 2);
		
		double media = soma/2.0;
		System.out.println(String.format("media = %.2f", media));
			
		read.close();
	}
}