// MERGE SORT
public class q18 {
  static int[] mergeSort(int[] arr1, int[] arr2){
    int p1 = 0, p2 = 0;
    int x =arr1[0], y = arr2[0];
    int[] mergeArr = new int[arr1.length + arr2.length];
    for (int i= 0; i<mergeArr.length;  i++){
      if (p1<arr1.length){
        x = arr1[p1];
      }
      if (p2<arr2.length){
        y = arr2[p2];
      }
      if (y<x){
        if (p2<arr2.length){
          mergeArr[i] = y;
          p2 ++;
        } else {
          mergeArr[i] = x;
          p1 ++;
        }
      } else {
        if (p1<arr1.length){
          mergeArr[i] = x;        
          p1++;
        } else {
          mergeArr[i] = y;
          p2 ++;
        }
      }
    }
    return mergeArr;
  }
  public static void main(String[] args) {
    int[] arr1 = {5,43, 45,54};
    int[] arr2 = {6,45,65, 456,645,6556};
    int[] arr3 = mergeSort(arr1, arr2);
    System.out.println("Merged Array: ");
    for (int x: arr3){
      System.out.print(x+", ");
    }
  }
}
 