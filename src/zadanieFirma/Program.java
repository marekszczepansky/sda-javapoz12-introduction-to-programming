package zadanieFirma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Program do zarządzania firmą");
    System.out.println("Podaj nazwę firmy: ");
    String nazwaFirmy = scanner.nextLine();

    Firma firma = new Firma(nazwaFirmy);

    int wybor = -1;
    while (wybor != 0) {
      System.out.println("Wybierz operację");
      System.out.println("1. Wypisz wszystkich pracownikow");
      System.out.println("2. Dodaj nowego pracownika");
      System.out.println("3. Usuń pracownika");
      System.out.println("0. Wyjście z programu");
      wybor = scanner.nextInt();
      // pobieranie danych o pracowniku
      // mamy dane, wiec tworzymy obiekt
      // imie i nazwisko z wykorzystaniem konstruktora
      // email i pensja przez setter
      // obiekt pracownika jest utworzony, dodajemy do firmy
      switch (wybor) {
        case 1:
          Pracownik[] pracownicy = firma.getPracownicy();
          if (firma.getLiczbaPracownikow() == 0) {
            System.out.println("Brak pracownikow - wybierz opcję 2, aby dodac nowego");
            break;
          }
          for (int i = 0; i < firma.getLiczbaPracownikow(); i++) {
            Pracownik p = pracownicy[i];
            String opisPracownika = String.format(
                "Imię: %s, Nazwisko: %s, e-mail: %s, pensja: %f",
                p.getImie(),
                p.getNazwisko(),
                p.getEmail(),
                p.getPensja()
            );
            System.out.println(opisPracownika);
          }
          break;
        case 2:
          System.out.println("Podaj imie");
          String imie = scanner.next();
          System.out.println("Podaj nazwisko");
          String nazwisko = scanner.next();
          System.out.println("Podaj email");
          String email = scanner.next();
          System.out.println("Podaj pensję");
          double pensja = scanner.nextDouble();
          Pracownik nowyPracownik = new Pracownik(imie, nazwisko);
          nowyPracownik.setEmail(email);
          nowyPracownik.setPensja(pensja);
          firma.dodajPracownika(nowyPracownik);
          break;
        case 3:
          System.out.println("Podaj id pracownika do usuniecia");
          int idDoUsuniecia = scanner.nextInt();
          Pracownik usunietyPracownik = firma.usunPracownika(idDoUsuniecia);
          System.out.println("Pracownik: "
              + usunietyPracownik.getId()
              + ", "
              + usunietyPracownik.getNazwisko()
              + " został usunięty");
          break;
        default:
          System.out.println("Nie ma takiej operacji - wybierz ponownie");
          break;
      }
    }
  }
}
