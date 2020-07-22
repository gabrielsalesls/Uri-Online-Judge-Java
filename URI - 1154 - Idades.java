import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    double total = 0;
    double cont = 0;

    int x = read.nextInt();
    while(x > 0){
      cont++;
      total += x;
      x = read.nextInt();
    }
    double media = total / cont;
    System.out.println(String.format("%.2f", media));
  }
}