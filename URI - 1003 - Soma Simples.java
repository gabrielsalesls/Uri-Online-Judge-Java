import java.io.IOException;
import java.util.Scanner;

/*
1003
Soma Simples
*/

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner read = new Scanner(System.in);
        int a, b, soma;

        a = read.nextInt();
        b = read.nextInt();
        soma = a + b;

        System.out.println("SOMA = "+ soma);

    }

}