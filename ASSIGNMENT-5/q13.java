import java.util.HashMap;

public class q13 {
  static void countFreq(long n) {
    HashMap<Long, Integer> freqHashMap = new HashMap<>();
    long digit;
    while (n > 0) {
      digit = n % 10;
      Integer oldVal = freqHashMap.get(digit);
      if (oldVal==null) {
        freqHashMap.put(digit, 1);
      } else {
        freqHashMap.put(digit, ++oldVal);
      }
      n /= 10;
    }
    System.out.println(freqHashMap);
  }

  public static void main(String[] args) {
    countFreq(1232312432134423432l);
  }
}
