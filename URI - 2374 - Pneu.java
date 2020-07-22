import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en","US"));
		Scanner read = new Scanner(System.in);
		
		int n1 = read.nextInt();
		int n2 = read.nextInt();
		
		System.out.println(n1-n2);
		
		read.close();
	}
}
