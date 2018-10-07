package matematyka;

public class MathHelper {
  // iteracyjne obliczanie silni
  public static int factorial(int n) {
    int wynik = 1;
    for (int i = 2; i <= n; i++) {
      wynik = wynik * i;
    }
    return wynik;
  }

  public static int factorialRecursive(int n) {
    if (n == 0 || n == 1) {
      return 1;
    } else {
      return n * factorialRecursive(n - 1);
    }
  }

  public static int fibonacci(int n) {
    return 0;
  }

  public static int fibIter(int n) {
    int result = 0;
    int temp1 = 0;
    int temp2 = 1;

    for (int i = 1; i < n; i++) {
      result = temp1 + temp2;
      temp1 = temp2;
      temp2 = result;
    }
    return result;
  }

  public static int fibRec(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    }
    return fibRec(n - 1) + fibRec(n - 2);
  }
}
