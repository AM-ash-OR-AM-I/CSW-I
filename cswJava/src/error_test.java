import java.util.ArrayList;

public class error_test {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<>();
        Integer i1 = new Integer("10");
        Integer i2 = new Integer("10");

        // Doesn't make a new object
        Integer i3 = Integer.valueOf("10");
        Integer i4 = Integer.valueOf("10");
        System.out.println(i1==i2);

        // Thus returns true
        System.out.println(i3==i4);

        // max value is 36 because no. of digits + no . of letter in alphabet
        System.out.println(Integer.valueOf("yz", 36));

        // Converts object to primitive datatype
        Integer n = new Integer(290);
        int a = n.intValue();
        byte b = n.byteValue();


        Boolean bool = new Boolean(false);
        System.out.println(bool);
        System.out.println(a);
        System.out.println(b);

    }
}
