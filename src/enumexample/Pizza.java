package enumexample;

public class Pizza {
  private String name;
  private double price;
  private Rozmiar rozmiar;

  public Pizza(String name, double price, Rozmiar rozmiar) {
    this.name = name;
    this.price = price;
    this.rozmiar = rozmiar;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Rozmiar getRozmiar() {
    return rozmiar;
  }

  public void setRozmiar(Rozmiar rozmiar) {
    this.rozmiar = rozmiar;
  }
}
