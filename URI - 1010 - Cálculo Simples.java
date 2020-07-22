import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
1010
Cálculo Simples
*/


public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int codigoPecaUm = read.nextInt();
        int numeroPecasUm = read.nextInt();
        double valorUnitarioPecaUm = read.nextDouble();

        int codigoPecaDois = read.nextInt();
        int numeroPecasDois = read.nextInt();
        double valorUnitarioPecaDois = read.nextDouble();

        double totalPagar = (numeroPecasUm * valorUnitarioPecaUm) + (numeroPecasDois * valorUnitarioPecaDois);

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", totalPagar));

    }

}