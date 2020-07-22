import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en","US"));
		Scanner read = new Scanner(System.in);
		int soma = 0;
		
		int n = read.nextInt();
		for(int i = 0; i < n; i++) {
			int tempo = read.nextInt();
			int velocidade = read.nextInt();
			
			soma += tempo * velocidade;
			
		}
		
		System.out.println(soma);
		
		read.close();
	}
}
