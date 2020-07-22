import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        while (leitor.hasNext()) {

          int X = leitor.nextInt();
          if(X==0) break;

          String teste = "";

           	for (int i = 1; i <= X; i++) {
              if(i == X) teste += (i+"");
              else teste += (i + " ");
        	}
          System.out.println(teste);
        }
        leitor.close();
    }
	
}