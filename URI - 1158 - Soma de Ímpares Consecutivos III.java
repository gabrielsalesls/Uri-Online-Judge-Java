import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en","US"));
		Scanner read = new Scanner(System.in);

		int numeroCasos = read.nextInt();

		for(int i = 0; i<numeroCasos; i++) {
			int x = read.nextInt();
			int y = read.nextInt();
			int cont = 0, soma = 0;;

			while(cont < y) {
				if(x%2!=0) {
					soma+=x;
					cont++;
				}
				x++;
			}
			System.out.println(soma);
		}
		read.close();
	}
}
