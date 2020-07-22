import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
import java.math.*;

/*
 * Exercicio 1038
 * Lanche
 */

public class Main {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		int codigo = read.nextInt();
		int quantidade = read.nextInt();
		double valorFinal = 0;
		
		switch(codigo) {
		case 1:
			valorFinal = quantidade * 4.00;
			break;
		case 2:
			valorFinal = quantidade * 4.50;
			break;
		case 3:
			valorFinal = quantidade * 5.00;
			break;
		case 4:
			valorFinal = quantidade * 2.00;
			break;
		case 5:
			valorFinal = quantidade * 1.50;
			break;
		}
		
		System.out.println(String.format("Total: R$ %.2f", valorFinal));
	}
}

