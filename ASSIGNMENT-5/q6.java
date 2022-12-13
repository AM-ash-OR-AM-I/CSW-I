public class q6 {
  static int countWords(String s){
    return s.split(" ").length;
  }
  public static void main(String[] args) {
    System.out.println(countWords("Hello World this has 6 words"));
  }  
}
