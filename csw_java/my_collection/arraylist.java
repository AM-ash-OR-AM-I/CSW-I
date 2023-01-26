package my_collection;

import java.util.ArrayList;
import java.util.Vector;

public class arraylist {
  public static void main(String[] args) {
    Vector<Integer> vector = new Vector<>(1);
    ArrayList<Integer> arrayList = new ArrayList<>(1);
    arrayList.add(332);
    vector.add(332);
    System.out.println(arrayList.size() + " " + vector.capacity());
    arrayList.add(432);
    vector.add(432);
    System.out.println(arrayList.size() + " " + vector.capacity());
    arrayList.add(4234);
    vector.add(4234);
    System.out.println(arrayList.size() + " " + vector.capacity());
    arrayList.add(22);
    vector.add(22);
    System.out.println(arrayList.size() + " " + vector.capacity());
  }
}