/*
* Read 2 integers of any length and find its sum
*/

import java.util.Scanner;

public class q8 {
  static Integer integer(String x) {
    return Integer.parseInt(x);
  }

  static String reverse(String s) {
    StringBuffer sb = new StringBuffer(s);
    return String.valueOf(sb.reverse());
  }

  static String padZeroes(String s) {
    return String.format("%64s", s).replace(" ", "0");
  }

  public static String findSum(String a, String b) {
    String sumString = "";
    int dig = 0, carry = 0;
    a = reverse(a);
    b = reverse(b);
    int maxLength = Math.max(a.length(), b.length());
    for (int i = 0; i < maxLength; i++) {
      int digSum;
      if (i == maxLength - 1) {
        if (a.length() == maxLength && b.length() == maxLength)
          dig = integer(a.substring(i, i + 1)) + integer(b.substring(i, i + 1)) + carry;
        else if (a.length() == maxLength)
          dig = integer(a.substring(i, i + 1)) + carry;
        else
          dig = integer(b.substring(i, i + 1)) + carry;
      } else {
        if (a.length() > i && b.length() > i) {
          digSum = integer(a.substring(i, i + 1)) + integer(b.substring(i, i + 1)) + carry;
        } else if (i < a.length()) {
          digSum = integer(a.substring(i, i + 1)) + carry;
        } else {
          digSum = integer(b.substring(i, i + 1)) + carry;
        }
        dig = digSum % 10;
        carry = digSum / 10;
      }
      sumString = dig + sumString;
    }
    return sumString;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any 2 integers a and b, separated by space: ");
    String a = sc.next();
    String b = sc.next();
    System.out.printf("%s + %s = %s", a, b, findSum(a, b));
    sc.close();
  }
}
