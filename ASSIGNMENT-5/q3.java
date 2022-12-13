public class q3 {
    static String padZeroes(String s){
        return String.format("%64s", s).replace(" ", "0");
    }
    static void swapIJ(int n, int i, int j) {
        String bin_string = padZeroes(Integer.toString(n, 2));
        String swapped_str = "";
        for (int x = 0; x < bin_string.length(); x++) {
            if (x == i) {
                swapped_str += bin_string.charAt(j);
            } else if (x == j) {
                swapped_str += bin_string.charAt(i);
            } else {
                swapped_str += bin_string.charAt(x);
            }
        }
        System.out.println(Long.parseLong(swapped_str, 2)+" "+swapped_str);

    }

    public static void main(String[] args) {
        int n = 1234;
        swapIJ(n, 1, 62);
    }
}
