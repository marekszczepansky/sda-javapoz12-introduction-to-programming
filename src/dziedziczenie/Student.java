package dziedziczenie;

public class Student extends Osoba {
  private String numerIndeksu;
  private String uczelnia;

  public Student(String imie, String nazwisko, int wiek) {
    super(imie, nazwisko, wiek);
  }

  @Override
  public void przedstawSie() {
    System.out.println("Jestem studentem");
  }

  public Student(String imie, String nazwisko, int wiek, String uczelnia) {
    super(imie, nazwisko, wiek);
    this.uczelnia = uczelnia;
  }


}
