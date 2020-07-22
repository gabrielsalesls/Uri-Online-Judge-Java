import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
1006
Media 2
*/

public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        /*DecimalFormat formatador = new DecimalFormat("0.00000");*/
        Scanner read = new Scanner(System.in);
        double a, b, c , media;

        a = read.nextDouble();
        b = read.nextDouble();
        c = read.nextDouble();
        media = ((a * 2) + (b * 3) + (c * 5)) / 10;

        System.out.printf("MEDIA = %.1f\n", media);

    }

}