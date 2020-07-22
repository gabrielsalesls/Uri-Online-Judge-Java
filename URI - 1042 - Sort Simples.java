import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1038
 * Lanche
 */

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		int n1 = read.nextInt();
		int n2 = read.nextInt();
		int n3 = read.nextInt();

		List<Integer> lista = new ArrayList<Integer>();

		lista.add(n1);
		lista.add(n2);
		lista.add(n3);

		Collections.sort(lista);

		for(int numero : lista) {
			System.out.println(numero);
		}

		System.out.println();
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}
}


