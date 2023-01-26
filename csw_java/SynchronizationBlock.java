class Calculator {
  void multiplicationTable(int n) {
    // Following block will ensure the method is accessible in synchronized manner
    synchronized (this) {
      for (int i = 1; i <= 10; i++) {
        System.out.println(Thread.currentThread().getName() + " : " + n * i);
        try {
          Thread.sleep(50);
        } catch (Exception e) {
          System.out.println(e);
        }
      }
    }
  }
}

class WorkerThread1 extends Thread {
  Calculator t;

  WorkerThread1(Calculator t) {
    this.t = t;
    // this.setName("Worker Thread 1");
  }

  public void run() {
    t.multiplicationTable(3);
  }
}

class WorkerThread2 extends Thread {
  Calculator t;

  WorkerThread2(Calculator t) {
    this.t = t;
    // this.setName("Worker Thread 2");
  }

  public void run() {
    t.multiplicationTable(40);
  }
}

public class SynchronizationBlock {
  public static void main(String args[]) {
    Calculator calculator = new Calculator();
    WorkerThread1 t1 = new WorkerThread1(calculator);
    WorkerThread1 t2 = new WorkerThread1(calculator);
    t1.start();
    t2.start();
  }
}

