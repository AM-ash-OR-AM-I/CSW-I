import java.util.ArrayList;
import java.util.List;

public class q17 {
  static void deleteDuplicates(ArrayList<Integer> arr) {
    Integer prev = null;
    for (int i=0; i< arr.size(); i++) {
      Integer x = arr.get(i);
      if (x.equals(prev)) {
        arr.remove(i);
      }
      prev = x;
    }

  }

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>(List.of(234, 234, 234, 334, 45, 45));
    deleteDuplicates(arr);
    System.out.println(arr);
  }
}
