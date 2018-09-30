package figury;

public class Prostokat extends Figura {

  private double a;
  private double b;

  public Prostokat(double a, double b) {
    this.a = a;
    this.b = b;
  }

  @Override
  public double obliczPole() {
    return 0;
  }

  @Override
  public double obliczObwod() {
    return 0;
  }
}
