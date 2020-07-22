import java.util.Scanner;

public class Main{

     public static void main(String []args){
         
         Scanner read = new Scanner(System.in);
         
         double a = read.nextDouble();
         double b = read.nextDouble();
         double c = read.nextDouble();

        double triangulo = (a*c)/2;
        double circulo = (c*c) * 3.14159;
        double trapezio = ((a + b) * c) / 2;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.println(String.format("TRIANGULO: %.3f", triangulo));
        System.out.println(String.format("CIRCULO: %.3f", circulo));
        System.out.println(String.format("TRAPEZIO: %.3f", trapezio));
        System.out.println(String.format("QUADRADO: %.3f", quadrado));        
        System.out.println(String.format("RETANGULO: %.3f", retangulo));
       
     }
}