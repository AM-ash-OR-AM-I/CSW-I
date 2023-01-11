package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode {
  public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
    ArrayList<Integer> applesTovisit = new ArrayList<>();
    for (int i = 0; i <= edges.length; i++) {
      if (hasApple.get(i))
        applesTovisit.add(i);
    }
    System.out.println(applesTovisit);
    return 1;
  }

  public static void main(String[] args) {
    int[][] edges = { { 0, 1 }, { 0, 2 }, { 1, 4 }, { 1, 5 }, { 2, 3 }, { 2, 6 } };
    // List<Boolean> hasApple = { false, false, false, false, false, false, false };
    // Leetcode leetcode = new Leetcode();
    // leetcode.minime(edges, hasApple);
  }
}
