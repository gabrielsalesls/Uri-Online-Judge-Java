import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;


/*
 * Exercicio 2930
 * TCC da Depressão Natalino
 */

public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		int e = read.nextInt();
		int d = read.nextInt();
		
		if(d>=24 || e > d) {
			System.out.println("Eu odeio a professora!");
		}else if (e<=d-3) {
			System.out.println("Muito bem! Apresenta antes do Natal!");
		}else {
			System.out.println("Parece o trabalho do meu filho!");
			if(d+2 <= 24) {
				System.out.println("TCC Apresentado!");
			} else {
				System.out.println("Fail! Entao eh nataaaaal!");
			}
		}
	}
}
