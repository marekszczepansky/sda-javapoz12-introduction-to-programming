package enumexample;

public class Program {
  public static void main(String[] args) {
    Pizza p = new Pizza("hawajska", 29.00, Rozmiar.DUZY);
    switch (p.getRozmiar()) {
      case MALY: {
        break;
      }
      case SREDNI: {
        break;
      }
    }

    Rozmiar r = Rozmiar.valueOf("maly");

    System.out.println(Rozmiar.MALY);
  }
}
