import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;


/*
 * Exercicio 1018
 * Cédulas
 */

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en","US"));
		
		Scanner read = new Scanner(System.in);

		double dinheiroTotal = read.nextDouble();

		int notas = (int) dinheiroTotal;
		int moedas = (int)((dinheiroTotal - notas) * 100);		
		int notasDe100 = (int) Math.abs(dinheiroTotal/100);
		int restoNotas = (int) dinheiroTotal % 100;

		int notasDe50 = Math.abs(restoNotas/50);
		restoNotas = restoNotas % 50;

		int notasDe20 = Math.abs(restoNotas/20);
		restoNotas = restoNotas % 20;
		
		int notasDe10 = Math.abs(restoNotas/10);
		restoNotas = restoNotas % 10;
		
		int notasDe5 = Math.abs(restoNotas/5);
		restoNotas = restoNotas % 5;
		
		int notasDe2 = Math.abs(restoNotas/2);
		restoNotas = restoNotas % 2;
		
		int moedasDe1 = restoNotas;
		
		int moedasDe50 = Math.abs(moedas/50);
		int restoMoedas = moedas % 50;
		
		int moedasDe25 = Math.abs(restoMoedas/25);
		restoMoedas = restoMoedas % 25;
		
		int moedasDe10 = Math.abs(restoMoedas/10);
		restoMoedas = restoMoedas % 10;
		
		int moedasDe5 = Math.abs(restoMoedas/5);
		restoMoedas = restoMoedas % 5;
		
		int moedasDe1Cent = restoMoedas;
		
		System.out.println("NOTAS:");
		System.out.println(String.format("%d nota(s) de R$ 100.00", notasDe100));
		System.out.println(String.format("%d nota(s) de R$ 50.00", notasDe50));
		System.out.println(String.format("%d nota(s) de R$ 20.00", notasDe20));
		System.out.println(String.format("%d nota(s) de R$ 10.00", notasDe10));
		System.out.println(String.format("%d nota(s) de R$ 5.00", notasDe5));
		System.out.println(String.format("%d nota(s) de R$ 2.00", notasDe2));
		System.out.println("MOEDAS:");
		System.out.println(String.format("%d moeda(s) de R$ 1.00", moedasDe1));
		System.out.println(String.format("%d moeda(s) de R$ 0.50", moedasDe50));
		System.out.println(String.format("%d moeda(s) de R$ 0.25", moedasDe25));
		System.out.println(String.format("%d moeda(s) de R$ 0.10", moedasDe10));
		System.out.println(String.format("%d moeda(s) de R$ 0.05", moedasDe5));
		System.out.println(String.format("%d moeda(s) de R$ 0.01", moedasDe1Cent));
		
		

	}
}
