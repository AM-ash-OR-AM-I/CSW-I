class A{
    public int a = 43;
    A(){
        System.out.println("No");
    }
    void show(){
        System.out.println(a);
    }
}
public class Test extends A{
    int a;
    int b;
    private Test(){
        super();
        System.out.println("Yes");
    }
    public static void main(String[] args) {
        Test test = new Test();
        
        // test.show();
    }
}
