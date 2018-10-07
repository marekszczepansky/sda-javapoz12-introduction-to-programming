package zadanieFirma.reader;

import zadanieFirma.Firma;
import zadanieFirma.Pracownik;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlEmployeeReader extends EmployeeReader {
  public XmlEmployeeReader(String path) {
    super(path);
  }

  @Override
  public Pracownik[] odczytajPracownikow() {
    try {
      JAXBContext context = JAXBContext.newInstance(Firma.class);
      Unmarshaller unmarshaller = context.createUnmarshaller();
      Firma firmaZPliku = (Firma) unmarshaller.unmarshal(new File(getPath()));

      // 1 wersja
//      if (firmaZPliku.getPracownicy() != null) {
//        return firmaZPliku.getPracownicy();
//      } else {
//        return new Pracownik[0];
//      }

      // 2 wersja - analogiczny zapis do powyższego
      return firmaZPliku.getPracownicy() != null
          ? firmaZPliku.getPracownicy()
          : new Pracownik[0];
    } catch (JAXBException e) {
      return new Pracownik[0];
    }
  }
}
