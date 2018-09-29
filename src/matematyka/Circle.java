package matematyka;

public class Circle {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public double calculateArea() {
    return Math.PI * Math.pow(radius, 2);
  }
}
