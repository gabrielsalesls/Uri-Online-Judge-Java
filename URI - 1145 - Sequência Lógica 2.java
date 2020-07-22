import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

 public class Main {
 
    public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);

		Scanner read = new Scanner(System.in);
		
		int x = read.nextInt();
		int y = read.nextInt();
		
		for(int i = 1; i <= y; i++){
			
			System.out.print(i);
			if(i%x == 0) System.out.println("");
			else System.out.print(" ");
			
		
		}
	}
}
