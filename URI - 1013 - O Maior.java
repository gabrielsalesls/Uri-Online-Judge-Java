import java.util.Scanner;
import java.lang.Math;

public class Main{

     public static void main(String []args){
         
         Scanner read = new Scanner(System.in);
         
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int resultado = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(String.format("%d eh o maior", resultado));

     }
}