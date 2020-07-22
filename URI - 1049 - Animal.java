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

		String esqueleto = read.nextLine();
		String especie = read.nextLine();
		String alimentacao = read.nextLine();
		
		if(esqueleto.equals("vertebrado") && especie.equals("ave") && alimentacao.equals("carnivoro")){
			System.out.println("aguia");
		}
		if(esqueleto.equals("vertebrado") && especie.equals("ave") && alimentacao.equals("onivoro")){
			System.out.println("pomba");
		}
		if(esqueleto.equals("vertebrado") && especie.equals("mamifero") && alimentacao.equals("onivoro")){
			System.out.println("homem");
		}
		if(esqueleto.equals("vertebrado") && especie.equals("mamifero") && alimentacao.equals("herbivoro")){
			System.out.println("vaca");
		}
		if(esqueleto.equals("invertebrado") && especie.equals("inseto") && alimentacao.equals("hematofago")){
			System.out.println("pulga");
		}
		if(esqueleto.equals("invertebrado") && especie.equals("inseto") && alimentacao.equals("herbivoro")){
			System.out.println("lagarta");
		}
		if(esqueleto.equals("invertebrado") && especie.equals("anelideo") && alimentacao.equals("hematofago")){
			System.out.println("sanguessuga");
		}
		if(esqueleto.equals("invertebrado") && especie.equals("anelideo") && alimentacao.equals("onivoro")){
			System.out.println("minhoca");
		}
	}
}

