public class q19 {
  static Object[] insertAtAny(Object[] arr, int index, int x){
    Object[] newArr = new Object[arr.length+1];
    int ind = 0;
    for(int i = 0; i<= arr.length; i++){
      if (i==index){
        newArr[i] = x;
      }
      else{
        newArr[i] = arr[ind];
        ind++;
      }
    }
    return newArr;
  }
  public static void main(String[] args) {
    Integer[] arr = {45, 435, 8756};
    Object[] newArr = insertAtAny(arr, 2 , 423);
    System.out.println("New Array");
    for(Object x: newArr){
      System.out.print(x+", ");
    }
    
  }
}
