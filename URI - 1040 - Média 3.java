import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
import java.math.*;

/*
 * Exercicio 1040
 * Média 3
 */

public class Main {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		double nota1 = read.nextDouble() * 2.0;
		double nota2 = read.nextDouble() * 3.0;
		double nota3 = read.nextDouble() * 4.0;
		double nota4 = read.nextDouble() * 1.0;
		
		double media = ((nota1+nota2+nota3+nota4) / 10.0);
		
		System.out.println(String.format("Media: %.1f", new BigDecimal(media)));
		
		if(media >= 7) {
			System.out.println("Aluno aprovado.");
		} else if (media < 7 & media >= 5) {
			
			System.out.println("Aluno em exame.");
			double notaExame = read.nextDouble();
			System.out.println(String.format("Nota do exame: %.1f", notaExame));
			double mediaComExame = ((media+notaExame) / 2);
			
			if(mediaComExame>=5) {
				System.out.println("Aluno aprovado.");
			} else { 
				System.out.println("Aluno reprovado.");
			}
			System.out.println(String.format("Media final: %.1f", mediaComExame));
			
		} else {
			System.out.println("Aluno reprovado.");
		}
		
	}
}

