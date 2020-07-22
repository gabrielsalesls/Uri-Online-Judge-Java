import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
1007
Diferença
*/


public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        int a, b, c , d, DIFERENCA;

        a = read.nextInt();
        b = read.nextInt();
        c = read.nextInt();
        d = read.nextInt();

        DIFERENCA = (a * b) - (c * d);

        System.out.println("DIFERENCA = " + DIFERENCA);

    }

}