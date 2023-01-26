import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction {
  String run(String str);
}

interface PrintFunction {
  void print(String hi);
}

interface Square {
  double square(int x);
}

public class lambda_function {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    // Instead of making another class to implement the interface we can use lambda
    // function
    StringFunction s = x -> x + "haha";
    PrintFunction p = (var) -> System.out.printf("prints the %s thing%n", var);
    p.print("hello");
    System.out.println(s.run("Hehe"));
    Square square = x -> x * x;
    System.out.println(square.square(3));
    Consumer<Integer> print = (n) -> {
      System.out.print(n + " ");
    };
    numbers.forEach(print);
  }
}
