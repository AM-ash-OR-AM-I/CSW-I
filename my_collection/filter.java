package my_collection;

import java.util.ArrayList;
import java.util.List;

public class filter {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>(List.of(2312, 324, 223, 2321, 32432));
    arrayList.stream().filter(n -> n % 2 == 1).forEach(n -> System.out.println(n));
  }
}
