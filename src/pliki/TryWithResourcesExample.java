package pliki;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
  private static final String PATH_TO_FILE = "/home/siwipi/IdeaProjects/pp/sda-javapoz12-introduction-to-programming/src/lorem-ipsum.txt";

  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new FileReader(PATH_TO_FILE))) {
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
