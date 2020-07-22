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

		int x;
		int y;
		boolean nulo = false;

		while(!nulo) {
			x = read.nextInt();
			y = read.nextInt();
			
			if(x == 0 || y == 0) {
				nulo = true;
			}else {
				if(y>0) {
					if(x>0) {
						System.out.println("primeiro");
					}else if(x<0) {
						System.out.println("segundo");
					}
				}else if(y<0) {
					if(x>0) {
						System.out.println("quarto");
					}else if(x<0) {
						System.out.println("terceiro");
					}
				}
			}
		}
	}
}


