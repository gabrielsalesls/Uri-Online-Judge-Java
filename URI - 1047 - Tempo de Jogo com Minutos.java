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

		int horaInicial = read.nextInt();
		int minutoInicial = read.nextInt();
		int horaFinal = read.nextInt();
		int minutoFinal = read.nextInt();

		int totalHoras = horaFinal - horaInicial;
		int totalMinutos = minutoFinal - minutoInicial;

		if(totalHoras < 0) {
			totalHoras = 24 + (horaFinal - horaInicial);
		}

		if(totalMinutos < 0) {
			totalMinutos = 60 + (minutoFinal - minutoInicial);
			totalHoras--;
			if(totalHoras < 0) {
				totalHoras += 24;
			}
		}
		
		if(horaInicial == horaFinal && minutoInicial == minutoFinal) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}else {
			System.out.println(String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", totalHoras, totalMinutos));
		}
	}
}
