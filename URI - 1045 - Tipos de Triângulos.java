import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;


/*
 * Exercicio 1045
 * Tipos de Triângulos
 */

public class Main {

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		double n1 = read.nextDouble();
		double n2 = read.nextDouble();
		double n3 = read.nextDouble();
		
		double a = Math.max(n1, Math.max(n2, n3));
		double b = 0;
		double c = 0;
		
		if(a == n1) {
			b = Math.max(n2, n3);
			c = Math.min(n2, n3);
		}else if(a == n2) {
			b = Math.max(n1, n3);
			c = Math.min(n1, n3);
		}else if(a == n3) {
			b = Math.max(n1, n2);
			c = Math.min(n1, n2);
		}
		
		if(a>=(b+c)) {
			System.out.println("NAO FORMA TRIANGULO");
		}else if((a*a) == (b*b)+(c*c)) {
			System.out.println("TRIANGULO RETANGULO");
		}else if((a*a) > (b*b)+(c*c)) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}else if((a*a) < (b*b)+(c*c)) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		
		if(a == b && a == c && b == c) {
			System.out.println("TRIANGULO EQUILATERO");
		}else if(a == b || a == c || b == c) {
			System.out.println("TRIANGULO ISOSCELES");
		}
	}
}
