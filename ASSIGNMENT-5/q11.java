public class q11 {
  static void reverseWords(String sentence) {
    String[] arr = sentence.split(" ");
    
    String newSentence = "";
    for (String word : arr) {
      String reverseWord = "";
      for (int i = 0; i < word.length(); i++) {
        reverseWord = word.charAt(i) + reverseWord;
      }
      newSentence += reverseWord + " ";
    }
    System.out.println(newSentence);
  }

  public static void main(String[] args) {
    reverseWords("A quick brown fox");
  }
}
