import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en","US"));
		Scanner read = new Scanner(System.in);
		

		
		boolean valido = true;
		double nota1, nota2 = 0;
		
		while(valido) {
			
			nota1 = read.nextDouble();			
			while(nota1 < 0 || nota1 > 10) {
				System.out.println("nota invalida");
				nota1 = read.nextDouble();
			}
			
			nota2 = read.nextDouble();
			while(nota2 < 0 || nota2 > 10) {
				System.out.println("nota invalida");
				nota2 = read.nextDouble();
			}
			
			double media = (nota1+nota2) / 2.0;
			System.out.println(String.format("media = %.2f", media));
			
			
			
			System.out.println("novo calculo (1-sim 2-nao)");
			int validacao = read.nextInt();
			
			
			while(validacao != 1 && validacao != 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				validacao = read.nextInt();
			}
						
			if(validacao == 2) valido = false;
			
		}		
		read.close();
	}
}
