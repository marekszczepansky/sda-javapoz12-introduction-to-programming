package zadanieFirma;

import java.util.Scanner;

public class Program {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Program do zarządzania firmą");
    System.out.println("Podaj nazwę firmy: ");
    String nazwaFirmy = scanner.nextLine();
    Firma firma = new Firma(nazwaFirmy);
    System.out.println("Wybierz operację");
    System.out.println("1. Wypisz wszystkich pracownikow");
    System.out.println("2. Dodaj nowego pracownika");
    System.out.println("3. Usuń pracownika");
    System.out.println("0. Wyjście z programu");
    int wybor = scanner.nextInt();
    while (wybor != 0) {
      switch (wybor) {
        case 1: {
          Pracownik[] pracownicy = firma.getPracownicy();
          for (Pracownik p : pracownicy) {
            String opisPracownika = String.format(
                "Imię: %s, Nazwisko: %s, e-mail: %s, pensja: %f",
                p.getImie(),
                p.getNazwisko(),
                p.getEmail(),
                p.getPensja()
            );
            System.out.println(opisPracownika);
            break;
          }
        }
      }
    }

  }
}
