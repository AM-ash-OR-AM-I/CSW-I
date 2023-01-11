package my_collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {
  public static void main(String[] args) {
    // Hashmaps
    System.out.println("Hasmaps: ");
    HashMap<Integer, String> hashMap = new HashMap<>();
    hashMap.put(432, "#@432");
    hashMap.put(3213, "3213");
    hashMap.put(32, "213");
    hashMap.put(3213, null);
    for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
      System.out.printf("%d: %s, ", entry.getKey(), entry.getValue());
    }
    System.out.println();

    // Treemaps
    /*
     * Same as hashmaps but it's always sorts key in ascending order
     */
    System.out.println("TreeMaps:");
    TreeMap<Integer, String> treeMap = new TreeMap<>();
    treeMap.put(432, "#@432");
    treeMap.put(32, "213");
    treeMap.put(3213, "3213");
    treeMap.put(3213, null);
    for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
      System.out.printf("%d: %s, ", entry.getKey(), entry.getValue());
    }
    System.out.println();

    // LinkedHashmaps
    System.out.println("LinkedHashmaps:");
    LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
    linkedHashMap.put(432, "#@432");
    linkedHashMap.put(3213, "3213");
    linkedHashMap.put(32, "213");
    linkedHashMap.put(3213, null);
    for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
      System.out.printf("%d: %s, ", entry.getKey(), entry.getValue());
    }
  }
}
