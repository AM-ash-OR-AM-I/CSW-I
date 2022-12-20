import java.util.HashMap;

public class q14 {
  static void countFreq(int[] arr) {
    HashMap<Integer, Integer> freqHashMap = new HashMap<>();
    for (int x : arr) {
      Integer oldVal = freqHashMap.get(x);
      if (oldVal == null) {
        freqHashMap.put(x, 1);
      } else {
        freqHashMap.put(x, ++oldVal);
      }
    }
    System.out.println(freqHashMap);
  }

  public static void main(String[] args) {
    int[] arr = { 4, 34, 234, 1, 4, 234 };
    countFreq(arr);
  }
}
