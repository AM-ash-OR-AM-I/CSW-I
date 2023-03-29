package my_collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
 * WAP to create a class student details
 * Create an object, print the object
 */

class Student {
  String name;
  int rollNo;
  int section;
  int marks;

  Student(String name, int rollNo, int marks, int section) {
    this.name = name;
    this.rollNo = rollNo;
    this.marks = marks;
    this.section = section;
  }

  public int hashCode() {
    return rollNo;
  }

  public String toString() {
    return name;
  }
}

public class hashMaps {
  public static void main(String[] args) {

    // Hashtable
    System.out.println("HashMap: ");
    HashMap<String, Integer> hashMap = new HashMap<>();
    hashMap.put("adfd", 34);
    hashMap.put("adfde", 34);
    hashMap.put("dfg", 34);
    hashMap.put("gbgds", 34);
    hashMap.put("gfd", 454);
    for (Map.Entry<String, Integer> mapElement : hashMap.entrySet()) {
    System.out.println(mapElement.getKey() + ": " + mapElement.getValue());
    }

    
    System.out.println("\nHashTable: ");
    Hashtable<Integer, Integer> hashtable = new Hashtable<>();
    hashtable.put(1, 34);
    hashtable.put(2, 34);
    hashtable.put(3, 34);
    hashtable.put(7, 34);
    hashtable.put(15, 34);
    hashtable.put(4, 34);
    hashtable.put(5, 454);
    for (Map.Entry<Integer, Integer> mapElement : hashtable.entrySet()) {
      System.out.println(mapElement.getKey() + ": " + mapElement.getValue());
    }
  }

}
