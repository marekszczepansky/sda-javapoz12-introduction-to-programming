package matematyka;

public class FactorialProgram {
  public static void main(String[] args) {
    int n = 20;
    int result = MathHelper.factorialRecursive(n);


   for(int i =0; i< 20; i++){
     System.out.println("Fib" + i + " wynosi: " + MathHelper.fibRec(i));
   }
    System.out.println("ITERACJA");
    for(int i =0; i< 20; i++){
      System.out.println("Fib" + i + " wynosi: " + MathHelper.fibIter(i));
    }
  }
}
