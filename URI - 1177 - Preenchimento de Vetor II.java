import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en","US"));
		Scanner read = new Scanner(System.in);

		int[] lista = new int[1000];
		int t = read.nextInt();
		int posicao = 0;

		while(posicao < 999) {
			for(int valor = 0; valor < t; valor++) {
				if (posicao > 999) break;
				lista[posicao] = valor;
				posicao++;
			}
		}
		
		for(int i = 0; i < lista.length; i++) {
			System.out.println(String.format("N[%d] = %d", i, lista[i]));
		}
		read.close();
	}
}
