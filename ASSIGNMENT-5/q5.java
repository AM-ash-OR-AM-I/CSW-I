// Find reverse of string
public class q5{
  static StringBuffer findReverse(String s){
    StringBuffer sb = new StringBuffer(s);
    return sb.reverse();
  }
  public static void main(String[] args) {
    System.out.println(findReverse("This is Ashutosh"));
  }
}