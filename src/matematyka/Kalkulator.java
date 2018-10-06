package matematyka;

import java.util.Scanner;

public class Kalkulator {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Podaj dwie liczby - wykonam dzielenie");
    int a = scanner.nextInt();
    System.out.println("Podaj druga liczbe:");
    int b = scanner.nextInt();

    try {
      int wynik = a / b;
      System.out.println(wynik);
    } catch (ArithmeticException e) {
      System.out.println("Nie dziel przez zero");
    }
  }
}
