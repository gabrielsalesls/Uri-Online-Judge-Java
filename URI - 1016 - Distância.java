import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner read = new Scanner(System.in);

    int km = read.nextInt();

    int tempo = km * 2;
    
    System.out.println(String.format("%d minutos", tempo));


  }
}