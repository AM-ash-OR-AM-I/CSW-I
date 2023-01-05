import java.util.List;

class Arithmetic<T>{
  T a, b;
  Arithmetic(T a, T b){
    this.a = a;
    this.b = b;
  }
  public T show(){
    return a;
  }
  public static <S> List<S> returnList(S a, S b){
    return List.of(a, b);
  }
}
public class generic {
  public static void main(String[] args) {
    Arithmetic<Integer> a = new Arithmetic<>(234, 342);
    System.out.println(a.show());
    List<String> lst = Arithmetic.returnList("43", "44");
    System.out.println(lst);
    System.out.println(a + " " + a.hashCode());
  }
  
}
