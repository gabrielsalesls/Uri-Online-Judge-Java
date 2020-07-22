import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;


/*
 * Exercicio 1035
 * Teste de Seleção
 */

public class Main {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		double a = read.nextDouble();
		double b = read.nextDouble();
		double c = read.nextDouble();
		
		if(a != 0) {
			double delta = (b*b) - (4*a*c);
			if(!(delta >= 0)) {
				System.out.println("Impossivel calcular");
			} else {
				if(delta == 0) {
					double raiz = -b / (2 * a);
					System.out.println(String.format("R1 = %.5f", raiz));
				}else {
					double raiz1 = ((-b + Math.sqrt(delta)) / (2*a));
					double raiz2 = ((-b - Math.sqrt(delta)) / (2*a));
					System.out.println(String.format("R1 = %.5f", raiz1));
					System.out.println(String.format("R2 = %.5f", raiz2));
				}
			}
		} else {
			System.out.println("Impossivel calcular");
		}

		
		
	}
}

