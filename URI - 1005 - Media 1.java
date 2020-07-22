import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
1005
Media 1
*/

public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        /*DecimalFormat formatador = new DecimalFormat("0.00000");*/
        Scanner read = new Scanner(System.in);
        double a, b, media;

        a = read.nextDouble();
        b = read.nextDouble();
        media = ((a * 3.5) + (b * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f\n", media);

    }

}