/*
* Make password from 1st 2 letters of name and month from DOB.
* Format of DOB: DD/MM/YYYY
*/

import java.util.Scanner;
public class q7 {
  public static String createPassword(String name, String dob) {
    String month = dob.split("/")[1];
    return name.substring(0, 2) + month;
  }
  public static void main(String[] args) {
    System.out.print("Enter your name: ");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println("Enter your DOB (DD/MM/YYYY): ");
    String dob = sc.nextLine();
    System.out.printf("Your password = %s\n",createPassword(name, dob));

  }
}
