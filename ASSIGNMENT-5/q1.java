public class q1 {
    static int countNoOfBits(int n){
        if (n>0){
            return countNoOfBits(n>>1)+1;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(countNoOfBits(5));
    }
}
