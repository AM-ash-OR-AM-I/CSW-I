import java.util.Scanner;

public class q9 {
  static int encodeSpreadsheet(String s) {
    s = s.toUpperCase();
    int encodedVal = 0;
    for (int i = 0; i < s.length(); i++) {
      encodedVal += (s.charAt(i) - 64) * Math.pow(26, i);
    }
    return encodedVal;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      String col = sc.next();
      System.out.printf("Encoded value of %s = %d", col,encodeSpreadsheet(col));
    }
  }
}
