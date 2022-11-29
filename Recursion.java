/*
 * Recursion is the technique of making a function call itself.
 *  This technique provides a way to break complicated problems 
 * down into simple problems which are easier to solve. 
 * Recursion may be a bit difficult to understand. 
 * The best way to figure out how it works is to experiment with it.
 */

// Print numbers 5 to 1 using recursion 

/**
 * Recursion
 */

public class Recursion {

  public static void printnum(int n) {
    // For printing numbers in Ascending order
    if (n == 6) {
      return;
    }
    System.out.println(n);
    printnum(n + 1);
  }

  public static void printnum_r(int n) {
    // For printing numbers in Descending order
    if (n == 0) {
      return;
    }
    System.out.println(n);
    printnum_r(n - 1);
  }

  public static void sum(int i, int n, int sum) {
    if (i == n) {
      sum += i;
      System.out.println(sum);
      return;
    }
    sum += i;
    sum(i + 1, n, sum);

  }

  public static int factorial(int n) {
    if (n == 1 || n == 0) {
      return 1;
    }

    int nm = factorial(n - 1);
    int fn = n * nm;
    return fn;

  }

  public static void fibonacci(int a, int b, int n) {

    if (n == 0) {
      return;
    }
    int c = a + b;
    System.out.println(c);
    fibonacci(b, c, n - 1);

  }

  public static int power(int x, int n) { // Stack height in n
    if (x == 0) {
      return 0;
    }

    if (n == 0) {
      return 1;
    }
    int nm = power(x, n - 1);
    int ans = x * nm;
    return ans;

  }

  public static int power_l(int x, int n) { // Stack height in logn
    if (x == 0) {
      return 0;
    }

    if (n == 0) {
      return 1;
    }

    if (n % 2 == 0) // n is even
    {
      return power_l(x, n / 2) * power_l(x, n / 2);
    } else // n is odd
    {
      return power_l(x, n / 2) * power_l(x, n / 2) * x;
    }

  }

  public static void towerOfHanoi(int n, String src, String helper, String dest) {
    if (n == 1) {
      System.out.println("Transfered   discs from " + src + " to " + dest);
      return;
    }
    towerOfHanoi(n - 1, src, dest, helper);
    System.out.println("Transfered discs from " + src + " to " + dest);
    towerOfHanoi(n - 1, helper, src, dest);

  }

  public static void main(String[] args) {

    // int n=5;
    // int i=1;
    // int sum=0;
    // int m =1;
    // int a=0;
    // int b=1;
    int n = 2;
    // printnum(m);
    // printnum_r(n);

    // sum(i, n, sum);

    // int ans = factorial(5);
    // System.out.println(ans);
    // System.out.println(a);
    // System.out.println(b);
    // fibonacci(a, b, n-2);
    // int ans = power_l(2, 5);
    // System.out.println(ans);
    towerOfHanoi(n, "S", "H", "D");

  }
}