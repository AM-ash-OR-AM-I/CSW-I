class TestThread implements Runnable{
  @Override
  public void run() {
    for (int i = 0; i <= 100; i++) {
      try{
        Thread.sleep(200);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
      System.out.println(i);
    }
  }
}
public class threading_java {
  public static void main(String[] args) {
    // Runnable and thread are similar only difference is runnable is interface,
    // so we can extend with another class.
    TestThread t = new TestThread();
    Thread thread = new Thread(t);
    thread.start();
    for (int i = 0; i <= 100; i++) {
      System.out.println("Main Thread");
    }
  }
}
