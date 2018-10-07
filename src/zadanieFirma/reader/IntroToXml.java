package zadanieFirma.reader;

import zadanieFirma.Firma;
import zadanieFirma.Pracownik;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class IntroToXml {
  public static void main(String[] args) throws JAXBException {
    Firma firma = new Firma("sda");
    Pracownik pracownik = new Pracownik("Jan", "Kowalski");
    pracownik.setPensja(1234);
    pracownik.setEmail("kowalski@sda.pl");

    firma.dodajPracownika(pracownik);

    JAXBContext context = JAXBContext.newInstance(Firma.class);
    Marshaller marshaller = context.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    marshaller.marshal(firma, new File("firma.xml"));

    Unmarshaller unmarshaller = context.createUnmarshaller();
    Firma unmarshal = (Firma) unmarshaller.unmarshal(new File("firma.xml"));
  }
}
