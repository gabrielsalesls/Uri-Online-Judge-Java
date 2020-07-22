import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

 public class Main {
 
    public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);

		Scanner read = new Scanner(System.in);
		
		int n1 = read.nextInt();
		int n2 = read.nextInt();
		
		if(n1 % n2 == 0 || n2 % n1 == 0){
			System.out.println("Sao Multiplos");
		}else{
			System.out.println("Nao sao Multiplos");
			}
		}
    }
