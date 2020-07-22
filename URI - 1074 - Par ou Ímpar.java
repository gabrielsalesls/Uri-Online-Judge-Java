import java.util.Locale;
import java.util.Scanner;

/*
 *
 * 
 */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		int numeroCasos = read.nextInt();
		int x;

		for(int i = 0; i<numeroCasos; i++) {
			x = read.nextInt();
			if(x == 0) {
				System.out.println("NULL");
			}else if(x % 2 == 0) {
				if(x > 0) {
					System.out.println("EVEN POSITIVE");
				}else {
					System.out.println("EVEN NEGATIVE");
				}			
			}else {
				if(x > 0) {
					System.out.println("ODD POSITIVE");
				}else {
					System.out.println("ODD NEGATIVE");
				}
			}
		}
		
		read.close();
	}
}



