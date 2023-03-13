class A {
    public int a = 43;

    A() {
        System.out.println("No");
    }

    void show() {
        System.out.println(a);
    }
}

public class Test extends MyClass {
    int a;
    int b;

    private Test() {
        super();
        System.out.println("Yes");
    }

    static <T> T test(T data){
        return data;
    }

    public static void main(String[] args) {
        Test test1 = new Test();
        System.out.println(test("332"));

        // test.show();
    }
}
