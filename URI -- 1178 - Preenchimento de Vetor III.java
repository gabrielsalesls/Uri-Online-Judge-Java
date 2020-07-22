import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en","US"));
		Scanner read = new Scanner(System.in);

		double x = read.nextDouble();
		double[] lista = new double[100];
		lista[0] = x;
		
		for(int i = 1; i<lista.length; i++) {
			lista[i] = lista[i-1] / 2.0000;
		}
		
		for(int i = 0; i<lista.length; i++) {
			System.out.println(String.format("N[%d] = %.4f", i, lista[i]));
		}		
		read.close();
	}
}

