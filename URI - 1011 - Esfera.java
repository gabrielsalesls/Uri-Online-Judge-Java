import java.util.Scanner;

//1011
//Esfera

public class Main{

     public static void main(String []args){
         
         Scanner read = new Scanner(System.in);
         
         double r = read.nextDouble();
         
         double volume = (4.0/3) * 3.14159 * (r * r * r);
         
         System.out.println(String.format("VOLUME = %.3f", volume));
       
     }
}