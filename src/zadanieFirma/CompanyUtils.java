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
      BufferedReader reader = Files.newBufferedReader(Paths.get(sciezka));
      String line = null;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
        //todo: zaimplementuj utworzenie obiektu Pracownik z lini z pliku
        String[] split = line.split(",");
        // id split[0]
        // imie split[1]
        // nazwisko split[2]
        // email split[3]
      }
    } catch (IOException e) {
      return new Pracownik[100];
    }
    return null;
  }
}
