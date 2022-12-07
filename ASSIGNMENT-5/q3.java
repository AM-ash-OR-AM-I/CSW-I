public class q3 {
    static void swapIJ(int n, int i, int j) {
        String bin_string = Integer.toString(n, 2);
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
        System.out.println(Integer.parseInt(swapped_str, 2));

    }

    public static void main(String[] args) {
        int n = 4234;
        swapIJ(n, 1, 5);
    }
}
