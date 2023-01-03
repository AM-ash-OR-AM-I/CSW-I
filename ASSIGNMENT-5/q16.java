public class q16 {
  static void rotate(int[] arr){
    int last = arr[arr.length-1];
    for(int i=arr.length-1; i>0; i--){
      arr[i] = arr[i-1];
    }
    arr[0] = last;
  }
  public static void main(String[] args) {
    int[] arr = { 3242, 43, 46, 43 };
    rotate(arr);
    for(int x: arr){
      System.out.print(x+ " ");
    }
  }
}
