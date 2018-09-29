package matematyka;


import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj promien: ");
    double r = scanner.nextDouble();
    Circle c = new Circle(r);

    String format = String.format("Pole koła o promieniu: %.1f to: %.2f", c.getRadius(), c.calculateArea());
    System.out.println(format);

    System.out.format("Pole koła o promieniu: %.1f to: %.2f", c.getRadius(), c.calculateArea());
  }
}
