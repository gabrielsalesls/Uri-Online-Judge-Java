import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1041
 *
 */

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		int cont = read.nextInt();
		int a=1, b=1, c=1;
		
		for(int i = 1; i<=cont; i++) {
			System.out.println(String.format("%d %d %d", a,b,c));
			b +=1; c+=1;
			System.out.println(String.format("%d %d %d", a,b,c));
			a +=1;
			b = a*a;
			c = a*b;
		}
		
		read.close();
	}
}


