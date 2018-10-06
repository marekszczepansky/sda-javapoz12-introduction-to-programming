package matematyka;

public class Circle {
  private double radius;

  public Circle(double radius) {
    if (radius <= 0) {
      throw new IllegalArgumentException("Radius cannot be less or equal 0!");
    }
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public double calculateArea() {
    return Math.PI * Math.pow(radius, 2);
  }
}
