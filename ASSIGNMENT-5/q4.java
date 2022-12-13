import java.util.Scanner;

public class q4 {
    static int add(int x, int y){
        while (y>0){
            int carry = (x&y)<<1;
            x = x^y;
            y = carry;
        }
        return x;
    }
    static int multiply(int x, int y){    
        int sum = 0;
        for (int i=0; i<y; i++){
            sum = add(sum, x);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.print("Enter 2 numbers to multiply: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        System.out.printf("%d X %d = %d",x, y, multiply(x, y));

    }    
}
