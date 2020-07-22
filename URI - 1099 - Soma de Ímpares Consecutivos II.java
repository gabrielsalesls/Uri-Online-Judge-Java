import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int n = read.nextInt();
		
		for(int i = 0; i<n; i++) {
		
			int soma = 0;
			int x = read.nextInt();
			int y = read.nextInt();
			int maior = Math.max(x, y);
			int menor = Math.min(x, y);
			
			for(int j = menor+1; j < maior; j++) {
				if(j%2==1) {
					soma += j;
				}
			}
			System.out.println(soma);
		}		
		read.close();
	}
}
