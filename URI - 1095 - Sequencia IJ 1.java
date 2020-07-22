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

		int i = 1;
		int j = 60;
		
		while(j>=0) {
			System.out.println(String.format("I=%d J=%d", i,j));
			i += 3;
			j -= 5;
		}
		
		
		read.close();
	}
}
