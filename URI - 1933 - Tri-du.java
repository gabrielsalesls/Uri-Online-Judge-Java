import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

 public class Main {
 
    public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);

		Scanner read = new Scanner(System.in);
		
		int a = read.nextInt();
		int b = read.nextInt();
		
		if(a>b) System.out.println(a);
		if(b>a) System.out.println(b);
		if(a==b) System.out.println(a);
		
		
		}
	}
