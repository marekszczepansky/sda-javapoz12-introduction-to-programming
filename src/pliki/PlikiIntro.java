package pliki;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PlikiIntro {
  private static final String PATH_TO_FILE = "/home/siwipi/IdeaProjects/pp/sda-javapoz12-introduction-to-programming/src/lorem-ipsum.txt";

  public static void main(String[] args) {

    BufferedReader reader = null;
    FileReader fileReader = null;
    try {
      fileReader = new FileReader(PATH_TO_FILE);
      reader = new BufferedReader(fileReader);
      String line;
      // najpierw odczytujemy zawartosc linii, jeśli linia była pusta, to będzie zwrócona wartość null
      // w drugiej cześci sprawdzamy, czy odczytaliśmy coś (wtedy zmienna line będzie różna od null)
      // jeśli line == null to obieg petli sie nie wykona
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (fileReader != null) {
        try {
          fileReader.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

  }
}
