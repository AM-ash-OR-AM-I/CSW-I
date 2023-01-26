interface MyInterface {
  public int add(int a, int b);
}

class NewTest implements MyInterface {

  public int add(int a, int b) {
    return a + b;
  }
}

public class interface_test {
  public static void main(String[] args) {
    MyInterface interfaceA = new NewTest();
    NewTest test = new NewTest();
    System.out.println(interfaceA.add(23, 43));
    System.out.println(test.add(23, 43));
  }
}
