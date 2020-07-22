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

		double x = read.nextDouble();
		double y = read.nextDouble();

		if(x==0 && y==0) {
			System.out.println("Origem");
		}else if(x==0) {
			System.out.println("Eixo Y");
		}else if(y==0) {
			System.out.println("Eixo X");
		}else if(y>0) {
			if(x>0) {
				System.out.println("Q1");
			}else if(x<0) {
				System.out.println("Q2");
			}
		}else if(y<0) {
			if(x>0) {
				System.out.println("Q4");
			}else if(x<0) {
				System.out.println("Q3");
			}
		}
	}
}


