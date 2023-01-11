package try_catch_java;

public class test {
  public static void main(String[] args) {
    try {
      int x = 2 / 0;
    } catch (ArithmeticException e) {
      System.out.println("Not possible");
    } finally {
      System.out.println("Finally, always executes.");
    }
  }
}
