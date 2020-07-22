import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
import java.util.Locale;

 public class Main {
 
    public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);

		Scanner read = new Scanner(System.in);
		
		double a = read.nextDouble();
		double b = read.nextDouble();
		double c = read.nextDouble();
		
		if(Math.abs(b-c) < a && a < b + c && Math.abs(a-c) < b && b < a+c && Math.abs(a-b) < c && c < a+b){
			System.out.println(String.format("Perimetro = %.1f", a+b+c));
		} else{
			double areaTrapezio = (c * (a + b)) / 2;
			System.out.println(String.format("Area = %.1f", areaTrapezio));
		}
		read.close();
    }
}