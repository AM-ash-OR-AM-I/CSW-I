public class q10 {
  static String convert(int n, int base1, int base2) {
    int decimal = Integer.parseInt(String.valueOf(n), base1);
    String result = Integer.toString(decimal, base2);
    return result;
  }
  public static void main(String[] args) {
    System.out.println(convert(1111, 2, 3));
  }
}
