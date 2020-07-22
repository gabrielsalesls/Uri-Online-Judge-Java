import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en","US"));
		Scanner read = new Scanner(System.in);
		
		int n = read.nextInt();
		
		for(int i = 0; i<n; i++) {
			int soma = read.nextInt();
			if(soma % 2 == 0) System.out.println(0);
			else System.out.println(1);
		}
		
		read.close();
	}
}
