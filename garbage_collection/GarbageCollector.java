package garbage_collection;
// Java Program to count number

// of employees working
// in a company

class Employee {

  private int ID;
  private String name;
  private int age;
  private static int nextId = 1;
  // it is made static because it
  // is keep common among all and
  // shared by all objects

  public Employee(String name, int age) {
    this.name = name;
    this.age = age;
    this.ID = nextId++;
  }

  public void show() {
    System.out.println("Id=" + ID + "\nName=" + name
        + "\nAge=" + age);
  }

  public void showNextId() {
    System.out.println("Next employee id will be="
        + nextId);
  }

  @Override
  protected void finalize() {
    System.out.println("Removing from heap, Garbage collection");
    --nextId;
    // In this case,
    // gc will call finalize()
    // for 2 times for 2 objects.
  }
}

public class GarbageCollector {
  public static void main(String[] args) {
    Employee E = new Employee("GFG1", 56);
    Employee F = new Employee("GFG2", 45);
    E.show();
    F.show();
    E.showNextId();
    F.showNextId();

    new Employee("#@4", 312);
    System.gc();
    { // It is sub block to keep
      // all those interns.
      Employee X = new Employee("GFG4", 23);
      Employee Y = new Employee("GFG5", 21);
      X.show();
      Y.show();
      X.showNextId();
      Y.showNextId();
      X = Y = null;
      System.gc();
      System.runFinalization();
    }
    // After countering this brace, X and Y
    // will be removed.Therefore,
    // now it should show nextId as 4.

    // Output of this line
    E.showNextId();
    // should be 4 but it will give 6 as output.
  }
}
