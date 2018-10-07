package zadanieFirma;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CompanyUtils {

  /**
   * Zapisuje pracownikow do pliku .txt
   *
   * @param pracownicy
   * @param path
   * @return Zwraca status operacji - true jeśli udało się zapisać, badz false w przeciwnym przypadku
   */
  public static boolean zapiszPracownikow(Pracownik[] pracownicy, String path) {
    try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(path))) {
      for (int i = 0; i < pracownicy.length; i++) {
        Pracownik pracownik = pracownicy[i];
        if (pracownik != null) {
          writer.write(pracownik.toString() + "\n");
        }
      }
      return true;
    } catch (IOException e) {
      return false;
    }
  }

  public static Pracownik[] odczytajPracownikow(String sciezka) {
    Pracownik[] wynik = new Pracownik[100];
    try {
      // odczytujemy z pliku - kazda linia w pliku to informacja o pracowniku
      // z każdej linii tworzymy nowy obiekt pracownika
      // dane są zapisane w poniższym formacie:
      // id, imie, nazwisko, email, adres, pensja
      // przecinek jest separatorem pola
      BufferedReader reader = Files.newBufferedReader(Paths.get(sciezka));
      int index = 0;
      String line = null;
      while ((line = reader.readLine()) != null) {
        String[] split = line.split(",");
        Pracownik pracownik = new Pracownik(split[1], split[2]);
        pracownik.setEmail(split[3]);
        pracownik.setAdres(split[4]);
        pracownik.setPensja(Double.valueOf(split[5]));
        wynik[index++] = pracownik;
      }
      return wynik;
    } catch (IOException e) {
      return new Pracownik[0];
    }
  }
}
