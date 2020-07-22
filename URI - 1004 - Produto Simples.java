import java.io.IOException;
import java.util.Scanner;

/*
1004
Produto Simples
*/

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner read = new Scanner(System.in);
        int a, b, PROD;

        a = read.nextInt();
        b = read.nextInt();
        PROD = a * b;

        System.out.println("PROD = "+ PROD);

    }

}