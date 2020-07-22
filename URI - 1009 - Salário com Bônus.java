import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
1009
Salário com bônus
*/


public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        String nome = read.nextLine();
        double salarioFixo = read.nextDouble();
        double totalVendasEmDinheiro = read.nextDouble();

        double salarioTotal = salarioFixo + ((totalVendasEmDinheiro * 15)/100);

        System.out.println(String.format("TOTAL = R$ %.2f", salarioTotal));

    }

}