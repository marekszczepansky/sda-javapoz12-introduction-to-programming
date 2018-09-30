package zadanieFirma;

import sun.plugin.dom.exception.InvalidAccessException;

public class Firma {
  private static final int MAKSYMALNA_LICZBA_PRACOWNIKOW = 100;
  private String nazwaFirmy;
  private Pracownik[] pracownicy;
  private int liczbaPracownikow; // pokazuje aktualny stan pracownikow i index w tablicy, gdzie wstawic nowego pracownika

  public Firma(String nazwaFirmy) {
    this.liczbaPracownikow = 0;
    this.nazwaFirmy = nazwaFirmy;
    this.pracownicy = new Pracownik[MAKSYMALNA_LICZBA_PRACOWNIKOW];
  }

  // getter dla pola nazwaFirmy -> bez settera
  public String getNazwaFirmy() {
    return this.nazwaFirmy;
  }

  // getter dla pola liczbaPracownikow -> bez settera
  public int getLiczbaPracownikow() {
    return liczbaPracownikow;
  }

  // getter dla pracownikow
  public Pracownik[] getPracownicy() {
    return this.pracownicy;
  }

  public boolean dodajPracownika(Pracownik nowyPracownik) {
    if (liczbaPracownikow < MAKSYMALNA_LICZBA_PRACOWNIKOW) {
      pracownicy[liczbaPracownikow++] = nowyPracownik;
      return true;
    }
    return false;
  }

  public Pracownik usunPracownika(int id) {
    // todo: Zaimplementuj kiedy pracownicy będą mieli swoje ID
    return null;
  }


}
