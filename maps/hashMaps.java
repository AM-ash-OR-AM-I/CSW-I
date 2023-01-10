package maps;

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

    // HashMaps
    HashMap<String, Integer> hashMap = new HashMap<>();
    hashMap.put("adfd", 34);
    hashMap.put("dfg", 34);
    hashMap.put("gfd", 454);
    hashMap.put("retw", null);
    // for (Map.Entry<String, Integer> mapElement : hashMap.entrySet()) {
    // System.out.println(mapElement.getKey() + ": " + mapElement.getValue());
    // }

    Hashtable<String, Integer> hashtable = new Hashtable<>();
    hashtable.put("adfd", 34);
    hashtable.put("dfg", 34);
    hashtable.put("gfd", 454);
    for (Map.Entry<String, Integer> mapElement : hashtable.entrySet()) {
      System.out.println(mapElement.getKey() + ": " + mapElement.getValue());
    }
  }

}
