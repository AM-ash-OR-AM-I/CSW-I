class MyClass {
  void test_run(String name) {
    synchronized (this) {
      for (int i = 0; i <= 10; i++) {
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        System.out.println(i);

      }
    }
  }
}

class multithread extends Thread {
  MyClass a;
  String name;

  multithread(MyClass a, String name) {
    this.a = a;
    this.name = name;
  }
  

  @Override
  public synchronized void run() {
    a.test_run(name);
  }
}

public class multi_threading_test {

  public static void main(String[] args) {
    MyClass a = new MyClass();
    multithread m1 = new multithread(a, "hello1");
    multithread m2 = new multithread(a, "hello2");
    m1.start();
    m2.start();
  }
}
