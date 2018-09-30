package dziedziczenie;

/*
  Stwórz bazową klasę abstrakcyjną figura i abstrakcyjne metody
  oblicz pole i obliczObwod, następnie stwórz podklasy Prostokat, Kwadrat i Kolo
  oraz zaimplementuj je

  W main() utworz referencje typu bazowego i w zależnosci od wyboru uzytkownika
  oblicz pole i obwod wybranej figury

  Przeciąż metodę toString() i w niej wypisz wymiary każdej figury

 */

public class Program {
  public static void main(String[] args) {
    Object nowyObiekt = new Object();


    Pracownik pracownik = new Pracownik("piotr", "nowak", 12);

    System.out.println(pracownik);

  }
}
