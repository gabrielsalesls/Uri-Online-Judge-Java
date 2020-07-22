import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en","US"));
		Scanner read = new Scanner(System.in);
		
		int t1 = read.nextInt() - 1;
		int t2 = read.nextInt() - 1;
		int t3 = read.nextInt() - 1;
		int t4 = read.nextInt();
		
		System.out.println(t1+t2+t3+t4);
		
		read.close();
	}
}
