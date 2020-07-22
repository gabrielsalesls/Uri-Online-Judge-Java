import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1051
 * Imposto de Renda
 */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		double valor = read.nextDouble();
		double imposto = 0;
		
		if(valor <= 2000.00) {
			System.out.println("Isento");
		}else if(valor <= 3000.00) {
			imposto = ((8.0/100.0) * (valor - 2000));
			System.out.println(String.format("R$ %.2f", imposto));
		}else if(valor <= 4500.00) {
			imposto = (((8.0/100.0) * 1000) + ((18.0/100) * (valor-3000)));
			System.out.println(String.format("R$ %.2f", imposto));
		}else {
			imposto = (((8.0/100.0) * 1000) + ((18.0/100) * 1500)) + ((28.0/100) * (valor-4500));
			System.out.println(String.format("R$ %.2f", imposto));
		}		
		read.close();
		
	}
}



