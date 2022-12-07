public class q2 {
    static int countParityBits(int n){
        int ct = 0;
        while (n>0){
            if ((n&1)==1){
                ct++;
            }
            n = n>>1;
        }
        return ct&1;
    }
    public static void main(String[] args) {
        for (int i=1; i<=127; i++){
            System.out.printf("For %s parity bit = %s\n", Integer.toString(i, 2), countParityBits(i));
        }
    }    
}
