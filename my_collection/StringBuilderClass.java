package my_collection;

public class StringBuilderClass {
  public static void main(String[] args) {
    /*
     * StringBuilder is around 2-3 times faster than StringBuffer
     * This is because StringBuffer is synchronized and thread safe,
     * while StringBuilder is asynchronized can run in parallel
     * i.e. multiple process can acess the String thus it's faster.
     * 
     * But we need synchronisation to prevent multiple threads acessing
     * that's the use of StringBuffer
     */
    StringBuilder sb = new StringBuilder("Hi");
    StringBuffer sb1 = new StringBuffer("Hi");
    sb.append("32");
    sb1.append("32");
    System.out.println(sb + " " + sb1);

    long startTime = System.currentTimeMillis();
    for (int i = 0; i <= 100_000_000; i++) {
      sb.append("test");
    }
    System.out.printf("Time taken by StringBuilder = %sms%n", System.currentTimeMillis() - startTime);

    startTime = System.currentTimeMillis();
    for (int i = 0; i <= 100_000_000; i++) {
      sb1.append("test");
    }
    System.out.printf("Time taken by StringBuffer = %sms%n", System.currentTimeMillis() - startTime);
  }
}
