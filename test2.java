/*
 * WAP to create a class student details
 * Create an object, print the object
 */

class Student {
  int rollNo;
  int section;
  int marks;
  Student(int rollNo, int marks, int section){
    this.rollNo = rollNo;
    this.marks = marks;
    this.section = section;
  }
}
public class test2 {
  public static void main(String[] args) {
    
    Student student1 = new Student(34234, 42, 3);
    Student student2 = new Student(34234, 42, 3);
    System.out.println(student1.equals(student2));
    System.out.println(student1.hashCode());
    System.out.println(student2.hashCode());
  }
  
}
