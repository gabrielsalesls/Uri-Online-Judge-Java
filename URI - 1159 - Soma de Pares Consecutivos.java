import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en","US"));
		Scanner read = new Scanner(System.in);

		boolean valido = true;

		while(valido) {

			int x = read.nextInt();
			if(x==0) break;
			
			int cont = 0, soma = 0;;

			while(cont < 5) {
				if(x%2==0) {
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

