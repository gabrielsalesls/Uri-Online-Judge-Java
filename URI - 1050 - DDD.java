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

		int ddd = read.nextInt();
		String destino;
		
		switch(ddd) {
		
		case 61:
			destino = "Brasilia";
			break;
		case 71:
			destino = "Salvador";
			break;
		case 11:
			destino = "Sao Paulo";
			break;
		case 21:
			destino = "Rio de Janeiro";
			break;
		case 32:
			destino = "Juiz de Fora";
			break;
		case 19:
			destino = "Campinas";
			break;
		case 27:
			destino = "Vitoria";
			break;
		case 31:
			destino = "Belo Horizonte";
			break;
		default:
			destino = "DDD nao cadastrado";
		}
		System.out.println(destino);
		
		read.close();
	}
}

