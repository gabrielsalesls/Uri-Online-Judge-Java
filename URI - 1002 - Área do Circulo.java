import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

//1002
//Área do Círculo

public class Main {

    public static void main(String[] args) throws IOException {

        DecimalFormat formatador = new DecimalFormat("0.0000");
        Scanner read = new Scanner(System.in);

        double area;
        double raio;
        double n = 3.14159;

        raio = read.nextDouble();

        area = n * (raio * raio);
        System.out.println("A=" + formatador.format(area));


    }

}