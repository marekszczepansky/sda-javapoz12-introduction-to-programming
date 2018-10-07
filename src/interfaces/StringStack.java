package interfaces;

import java.util.EmptyStackException;

public class StringStack implements BasicCollection {
  private static final int INITIAL_CAPACITY = 5;
  private String[] elements;
  private int index = 0;

  public StringStack() {
    this.elements = new String[INITIAL_CAPACITY];
  }

  @Override
  public boolean addElement(String text) {
    if (index < INITIAL_CAPACITY) {
      elements[index++] = text;
      System.out.println("Dodano element");
      return true;
    } else {
      // todo: delete this
      System.out.println("Stos pełny - nie mozna dodac - zwracam false");
      return false;
    }
  }

  /**
   * Usuwa element z szcztu stosu i go zwraca
   *
   * @return Zwraca usunięty element
   */
  @Override
  public String removeElement() {
    if (index == 0) {
      throw new EmptyStackException();
    }
    String elementToRemove = elements[index - 1];
    elements[index - 1] = null; // oznaczamy ten element jako do usunięcia przez garbadge collector
    index--;
    return elementToRemove;
  }

  @Override
  public String removeElement(int index) {
    throw new UnsupportedOperationException();
  }

  public void printElements() {
    System.out.println("Zawartosc stosu");
    // < java 8
    for (String s : elements) {
      if (s != null) {
        System.out.println(s);
      }
    }

    // java 8 - method reference
    /*
    Arrays.stream(elements)
        .filter(Objects::nonNull)
        .forEach(System.out::println);
        */
  }

}
