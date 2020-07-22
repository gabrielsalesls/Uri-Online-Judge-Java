import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
1008
Salário
*/


public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int number = read.nextInt();
        int hours = read.nextInt();
        double valor = read.nextDouble();

        double salary = hours * valor;

        System.out.println("NUMBER = " + number);
        System.out.println(String.format("SALARY = U$ %.2f", salary));

    }

}