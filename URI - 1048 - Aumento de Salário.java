import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1051
 * Imposto de Renda
 */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		double salario = read.nextDouble();
		double valorReajuste = 0;
		int percentual = 0;
		
		if(salario >= 0 && salario <= 400) {
			valorReajuste = salario * (15.0/100);
			percentual = 15;
		}else if(salario > 400 && salario <= 800) {
			valorReajuste = salario * (12.0/100);
			percentual = 12;
		}else if(salario > 800 && salario <= 1200) {
			valorReajuste = salario * (10.0/100);
			percentual = 10;
		}else if(salario > 1200 && salario <= 2000) {
			valorReajuste = salario * (7.0/100);
			percentual = 7;
		}else if(salario > 2000) {
			valorReajuste = salario * (4.0/100);
			percentual = 4;
		}
		
		System.out.println(String.format("Novo salario: %.2f", salario+valorReajuste));
		System.out.println(String.format("Reajuste ganho: %.2f" , valorReajuste));
		System.out.println("Em percentual: " + percentual + " %");
		
		read.close();
		
	}
}



