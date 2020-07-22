import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner read = new Scanner(System.in);

    int tempoViagem = read.nextInt();

    int mediaVelocidade = read.nextInt();

    double gastoCombustivel = (tempoViagem * mediaVelocidade) / 12.0;
  
    System.out.println(String.format("%.3f", gastoCombustivel));


  }
}