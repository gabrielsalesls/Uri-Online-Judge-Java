import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en","US"));
		Scanner read = new Scanner(System.in);
		
		int reclamacoes;
		while(read.hasNext()) {
			reclamacoes = read.nextInt();
			if(reclamacoes == 0) System.out.println("vai ter copa!");
			else System.out.println("vai ter duas!");
		}
		
		read.close();
	}
}
