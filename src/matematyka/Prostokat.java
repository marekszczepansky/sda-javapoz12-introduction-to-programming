package matematyka;

public class Prostokat {
  public double bokA;
  public double bokB;

  public Prostokat(double bokA, double bokB) {
    if (bokA <= 0 || bokB <= 0) {
      throw new DimensionNotPositiveException("Bok figury musi byc dodatni");
    }
    this.bokA = bokA;
    this.bokB = bokB;
  }

  public double obliczPole() {
    return bokA * bokB;
  }

  public double obliczObwod() {
    return 2 * this.bokA + 2 * this.bokB;
  }
}
