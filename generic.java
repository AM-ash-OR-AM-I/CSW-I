import java.util.Arrays;
import java.util.List;

class Arithmetic<T>{
  public <S> List<S> concat(S a, S b){
    return List.of(a, b);
  }
}
public class generic {
  public static void main(String[] args) {
    Arithmetic<Integer> a = new Arithmetic<>();
    List<String> lst = a.concat("43", "44");
    System.out.println(lst);
    System.out.println(a + " " + a.hashCode());
  }
  
}
