/*
* Read 2 integers of any length and find its sum
*/

import java.util.Scanner;
public class q8 {
  public static String findSum(String a, String b) {
      String sumString = "";
      int dig = 0, carry = 0;
      int maxLength = Math.max(a.length(), b.length());
      for(int i =0; i<maxLength; i++){
        if(a.length()>i && b.length()>i){
          int digSum = Integer.parseInt(a.substring(i, i+1)) + Integer.parseInt(b.substring(i, i+1)) + carry;
          dig = digSum%10;
          carry = digSum/10;
        } else if (a.length()>i){
          
        }
        sumString+=dig;
      }
      return sumString;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any 2 integers a and b, separated by space: ");
    String a = sc.next();
    String b = sc.next();
    System.out.printf("%s + %s = %s", a, b, findSum(a, b));
  }  
}
