import java.util.Scanner;

/* 1014
Consumo */

class Main {
  public static void main(String[] args) {

    Scanner read = new Scanner(System.in);

    int x = read.nextInt();
    double y = read.nextDouble();

    double gastoMedio = x / y;

    System.out.println(String.format("%.3f km/l", gastoMedio));

  }
}