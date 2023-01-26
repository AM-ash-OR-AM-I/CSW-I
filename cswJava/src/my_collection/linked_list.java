package my_collection;

import java.util.LinkedList;

public class linked_list {
  public static void main(String[] args) {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(23);
    linkedList.addFirst(23);
    linkedList.add(432);
    linkedList.add(34);
    for (int x : linkedList) {
      System.out.println(x);
    }
  }
}
