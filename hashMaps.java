import java.util.HashMap;
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
  Student(String name, int rollNo, int marks, int section){
    this.name = name;
    this.rollNo = rollNo;
    this.marks = marks;
    this.section = section;
  }
  public int hashCode(){
    return rollNo;
  }

  public String toString(){
    return name;
  }
}
public class hashMaps {
  public static void main(String[] args) {
    
    Student student1 = new Student("Ashu", 3014, 42, 3);
    System.out.println(student1.hashCode());
    System.out.println(student1.toString());

    // HasMaps
    HashMap<String, Integer> hashMap = new HashMap<>();
    hashMap.put("adfd", 34);
    hashMap.put("dfg", 34);
    hashMap.put("gfd",454);
    hashMap.put("rtet", 34243);
    hashMap.put("gfdg", 34243);
    hashMap.put("ert", 34243);
    hashMap.put("retw", 34243);
    for (Map.Entry<String,Integer> mapElement: hashMap.entrySet()){
      System.out.println(mapElement.getKey()+ ": "+mapElement.getValue()
      );
    }
  }
  
}
