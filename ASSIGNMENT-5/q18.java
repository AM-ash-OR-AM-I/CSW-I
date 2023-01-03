// MERGE SORT
public class q18 {
  static int[] mergeSort(int[] arr1, int[] arr2){
    int p1 = 0, p2 = 0;
    int[] mergeArr = new int[arr1.length + arr2.length];
    for (int i= 0; i<mergeArr.length;  i++){
      int x = arr1[p1], y = arr2[p2];
      if (y<x && p2<arr2.length-1){
        p2 ++;
        mergeArr[i] = y;
      } else {
        if (p1<arr1.length-1)
        p1++;
        mergeArr[i] = x;
      }
    }
    return mergeArr;
  }
  public static void main(String[] args) {
    int[] arr1 = {5,43, 45,54};
    int[] arr2 = {6,45,65, 456,645,6556};
    int[] arr3 = mergeSort(arr1, arr2);
    for (int x: arr3){
      System.out.println(x);
    }
  }
}
 