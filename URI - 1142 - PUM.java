import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;


/*
 * Exercicio 1142
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en","US"));
		Scanner read = new Scanner(System.in);

		int numerosInicio = 1;
		int numerosFinal = numerosInicio + 2;
		
		int n = read.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			for(int y = numerosInicio; y <= numerosFinal; y++) {
				System.out.printf(y + " ");
				
			}
			System.out.println("PUM");
			numerosInicio += 4;
			numerosFinal += 4;
			
		}
		read.close();
	}
}
