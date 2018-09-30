package dziedziczenie;

public class Pracownik extends Osoba {
  private String stanowisko;

  public Pracownik() {
    System.out.println("Konstruktor bezparametrowy Pracownik");
  }

  public Pracownik(String imie, String nazwisko, int wiek) {
    super(imie, nazwisko, wiek);
    System.out.println("Tworze pracownika");
  }

  @Override
  public void przedstawSie() {
    System.out.println("Jestem pracownikiem");
  }

  public String getStanowisko() {
    return stanowisko;
  }

  public void setStanowisko(String stanowisko) {
    this.stanowisko = stanowisko;
  }


  public void tylkoWPracowniku() {

  }

  @Override
  public String toString() {
    return "Jestem: " + imie + this.getNazwisko() + this.getStanowisko();
  }

}
