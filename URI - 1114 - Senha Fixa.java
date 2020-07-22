import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio 1133
 * Resto da Divisão
 */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		int senha;
		boolean acesso = false;
		
		
		while(!acesso) {
			senha = read.nextInt();
			if(senha == 2002) {
				System.out.println("Acesso Permitido");
				acesso = true;
			}else {
				System.out.println("Senha Invalida");
			}
		}
		
		read.close();
	}
}
