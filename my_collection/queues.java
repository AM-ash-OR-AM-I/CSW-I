package my_collection;

import java.util.PriorityQueue;

public class queues {
  public static void main(String[] args) {
    PriorityQueue<String> queue = new PriorityQueue<>();
    queue.add("a");
    queue.add("adf");
    queue.add("ad");
    queue.add("abc");
    int n = queue.size();
    System.out.println(queue + " " + n);
    for (int i = 0; i < n; i++) {
      System.out.println(queue.poll() + " " + queue);
    }
  }
}
