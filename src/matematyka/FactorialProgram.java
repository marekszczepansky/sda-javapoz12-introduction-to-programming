package matematyka;

public class FactorialProgram {
  public static void main(String[] args) {
    int n = 20;
    int result = MathHelper.factorialRecursive(n);
//    System.out.println(n + "! wynosi: " + result);
//    System.out.println(MathHelper.factorial(1));
//    System.out.println(MathHelper.factorial(2));
//    System.out.println(MathHelper.factorial(3));
//    System.out.println(MathHelper.factorial(4));
//    System.out.println(MathHelper.factorial(5));
//    System.out.println(MathHelper.factorial(6));

   for(int i =0; i< 20; i++){
     System.out.println("Fib" + i + " wynosi: " + MathHelper.fibRec(i));
   }
    System.out.println("ITERACJA");
    for(int i =0; i< 20; i++){
      System.out.println("Fib" + i + " wynosi: " + MathHelper.fibIter(i));
    }
  }
}
