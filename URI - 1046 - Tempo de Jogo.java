import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;


/*
 * Exercicio 2930
 * TCC da Depressão Natalino
 */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		int inicio = read.nextInt();
		int fim = read.nextInt();
		
		if(inicio == fim) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}else if(inicio > fim) {
			System.out.println(String.format("O JOGO DUROU %d HORA(S)", (24-inicio+fim)));
		}else {
			System.out.println(String.format("O JOGO DUROU %d HORA(S)", (fim-inicio)));
		}
		read.close();
	}
}

