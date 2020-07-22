import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;


/*
 * Exercicio 1035
 * Teste de Seleção
 */

public class Main {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		int numeroGrenais = 0;
		int cont = 0;
		int golsInter, golsGremio, vitoriasInter = 0, vitoriasGremio = 0, empates = 0;
		
		do {
			golsInter = read.nextInt();
			golsGremio = read.nextInt();
			numeroGrenais += 1;
			
			if(golsInter == golsGremio) {
				empates++;
				System.out.println(empates);
			}else if(golsInter > golsGremio) {
				vitoriasInter++;
			}else {
				vitoriasGremio++;
			}

			System.out.println("Novo grenal (1-sim 2-nao)");
			cont = read.nextInt();
		}while(cont != 2);
		
		System.out.println(String.format("%d grenais", numeroGrenais));
		System.out.println(String.format("Inter:%d", vitoriasInter));
		System.out.println(String.format("Gremio:%d", vitoriasGremio));
		System.out.println(String.format("Empates:%d", empates));
		if(vitoriasInter > vitoriasGremio) {
			System.out.println(String.format("Inter venceu mais"));
		}else {
			System.out.println(String.format("Gremio venceu mais"));
		}
		
	}
}

