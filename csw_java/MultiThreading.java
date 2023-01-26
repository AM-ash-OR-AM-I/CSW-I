

public class MultiThreading extends
    Thread {
  @Override
  public void run() {
    for (int i = 0; i <= 100; i++) {
      try{
        Thread.sleep(200);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
      System.out.println(i);
      System.out.println(Thread.currentThread().getName());
    }
  }

  public static void main(String[] args) {
    MultiThreading multi1 = new MultiThreading();
    MultiThreading multi2 = new MultiThreading();
    multi1.setPriority(Thread.MIN_PRIORITY);
    multi2.setPriority(Thread.MAX_PRIORITY);
    multi1.start();
    multi2.start();
    // for (int i = 0; i <= 10; i++) {
    // System.out.printf("Main Thread is running %s%n", i);
    //
  }
}
