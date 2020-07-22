import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en","US"));
		Scanner read = new Scanner(System.in);
		
		int curupira = read.nextInt() * 300;
		int boitata = read.nextInt() * 1500;
		int boto = read.nextInt() * 600;
		int mapinguari = read.nextInt() * 1000;
		int lara = read.nextInt() * 150;
		
		int soma = curupira + boitata + boto + mapinguari + lara + 225;
		
		System.out.println(soma);
		
		
		read.close();
	}
}
