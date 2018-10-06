package zadanieFirma;

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
}
