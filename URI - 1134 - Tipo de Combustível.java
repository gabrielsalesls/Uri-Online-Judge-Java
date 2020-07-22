import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;


/*
 * Exercicio 1134
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en","US"));
		Scanner read = new Scanner(System.in);

		boolean valido = true;
		int alcool = 0, gasolina = 0, diesel = 0;
		
		while(valido) {
			int combustivel = read.nextInt();
			
			if(combustivel == 1) alcool++;
			if(combustivel == 2) gasolina++;
			if(combustivel == 3) diesel++;
			if(combustivel == 4) valido = false;		
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println(String.format("Alcool: %d", alcool));
		System.out.println(String.format("Gasolina: %d", gasolina));
		System.out.println(String.format("Diesel: %d", diesel));	
		read.close();
	}
}
