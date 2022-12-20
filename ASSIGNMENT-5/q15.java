public class q15 {
  static boolean isPrime(int x) {
    for (int i = 2; i * i <= x; i++) {
      if (x % i == 0) {
        return false;
      }
    }
    return true;
  }

  static int countPrimes(int[] arr) {
    int count = 0;
    for (int x : arr) {
      if (isPrime(x))
        count++;
    }
    return count;
  }

  public static void main(String[] args) {
    int[] arr = { 234, 2, 4, 3, 5 };
    System.out.println(countPrimes(arr));
  }
}
