package zadanieFirma;

import zadanieFirma.reader.EmployeeReader;
import zadanieFirma.reader.TxtEmployeeReader;
import zadanieFirma.reader.XmlEmployeeReader;

public class EmployeeReaderFactory {

  // w sygnaturze metody zwracany jest podany typ abstrakcyjny
  // i w zależności od parametru zwracamy konkretny obiekt
  public static EmployeeReader createEmployeeReader(String path) {
    if (path.endsWith("txt")) {
      return new TxtEmployeeReader(path);
    } else if (path.endsWith("xml")) {
      return new XmlEmployeeReader(path);
    } else {
      throw new RuntimeException("Cannot create reader - format not supported");
    }
  }
}
