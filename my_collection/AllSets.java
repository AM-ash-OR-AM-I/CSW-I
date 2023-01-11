package my_collection;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class AllSets {
  public static void main(String[] args) {
    System.out.println("TreeSet: ");
    TreeSet<String> treeSet = new TreeSet<>();
    treeSet.add("abdcd");
    treeSet.add("ab");
    treeSet.add("abcd");
    treeSet.add("abcde");
    treeSet.add("abdf");
    treeSet.add("abfg");
    for (String mInteger : treeSet) {
      System.out.println(mInteger);
    }
    System.out.println();
    // LinkedSet
    /*
     * Preserves the order of insertion
     */
    System.out.println("LinkedHashSet: ");
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
    linkedHashSet.add("abdcd");
    linkedHashSet.add("ab");
    linkedHashSet.add("abcd");
    linkedHashSet.add("abcde");
    linkedHashSet.add("abdf");
    linkedHashSet.add("abfg");
    for (String mInteger : linkedHashSet) {
      System.out.println(mInteger);
    }
  }
}
