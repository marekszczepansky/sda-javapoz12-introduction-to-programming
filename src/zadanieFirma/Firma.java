package zadanieFirma;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class Firma {
  private static final int MAKSYMALNA_LICZBA_PRACOWNIKOW = 100;
  @XmlAttribute(name = "nazwa")
  private String nazwaFirmy;
  @XmlElement(name = "pracownik")
  @XmlElementWrapper(name = "pracownicy")
  private Pracownik[] pracownicy;
  private int liczbaPracownikow; // pokazuje aktualny stan pracownikow i index w tablicy, gdzie wstawic nowego pracownika

  public Firma() {
  }

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

  /**
   * Usuwa pracownika i zwraca referencje do tego pracownika lub zwraca null, jesli nie znaleziono
   *
   * @param id
   * @return usuwanego pracownika lub null jesli nie znaleziono
   */
  public Pracownik usunPracownika(int id) {
    // todo: Zaimplementuj kiedy pracownicy będą mieli swoje ID
    Pracownik pracownikDoUsuniecia = null;
    for (int i = 0; i < liczbaPracownikow; i++) {
      if (pracownicy[i].getId() == id) {
        // pracownik znaleziony
        pracownikDoUsuniecia = pracownicy[i];
        pracownicy[i] = null;
        liczbaPracownikow--;
        break;
      }
    }
    // todo: napraw tablicę
    Pracownik[] nowaTablica = new Pracownik[MAKSYMALNA_LICZBA_PRACOWNIKOW];

    // index - wskaźnik w "nowejTablicy" na pierwsze wolne miejsce - zwiekszany tylko, jesli spotkamy pracownika w starej tablicy (a nie null'a)
    int index = 0;
    for (int i = 0; i < pracownicy.length; i++) {
      if (pracownicy[i] != null) {
        nowaTablica[index] = pracownicy[i];
        index++;
      }
    }
    pracownicy = nowaTablica;
    return pracownikDoUsuniecia;
  }


}
