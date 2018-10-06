package matematyka;


import java.util.Scanner;

public class Program {
  public static void main(String[] args) {

    System.out.println();

    Scanner scanner = new Scanner(System.in);

    Prostokat prostokat = new Prostokat(-2, 2);


    System.out.println("Podaj promien: ");
    double r = scanner.nextDouble();

    Circle c = null;
    // if

    c = new Circle(r);

    // vs try-catch
    try {
      c = new Circle(r);
    } catch (IllegalArgumentException ex) {
      System.out.println("WYJĄTEK!!!!");
    }

    System.out.println("Kod po bloku catch");
    if (c != null) {
      String format = String.format("Pole koła o promieniu: %.1f to: %.2f", c.getRadius(), c.calculateArea());
      System.out.println(format);
      System.out.format("Pole koła o promieniu: %.1f to: %.2f", c.getRadius(), c.calculateArea());
    } else {
      System.out.println("Uruchom program jeszcze raz");
    }

  }
}
