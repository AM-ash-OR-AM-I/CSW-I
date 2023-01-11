package my_collection;

import java.util.Arrays;
import java.util.PriorityQueue;

public class adq2 {
  public static int maxTwoNonOverLapping(int[][] intervals) {

    Arrays.sort(intervals,
        (a, b) -> (a[0] == b[0]) ? a[1] - b[1]
            : a[0] - b[0]);

    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

    int max = 0;
    int ans = 0;

    for (int[] e : intervals) {
      while (!pq.isEmpty()) {
        if (pq.peek()[0] >= e[0])
          break;
        int[] qu = pq.remove();
        max = Math.max(max, qu[1]);
      }

      ans = Math.max(ans, max + e[2]);
      pq.add(new int[] { e[1], e[2] });
    }

    return ans;
  }

  public static void main(String[] args) {
    int[][] interval
            = { { 1, 3, 2 }, { 4, 5, 2 }, { 1, 5, 5 } };
        int maxValue = maxTwoNonOverLapping(interval);
        System.out.println(maxValue);
  }
}
