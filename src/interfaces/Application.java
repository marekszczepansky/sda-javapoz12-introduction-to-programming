package interfaces;

public class Application {
  public static void main(String[] args) {
    StringStack stringStack = new StringStack();
    stringStack.addElement("text");
    stringStack.addElement("text2");
    String x = stringStack.removeElement();
    System.out.println("Usunięto element:" + x);
    stringStack.printElements();

  }
}
