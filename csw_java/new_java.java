import java.util.Scanner;

enum Day{
    sunday(1),
    monday(2),
    tuesday(3),
    wednesday(4),
    thursday(5),
    friday(6),
    saturday(7);
    String day;
    final int dayNo;
    Day(int day){
        dayNo = day;
    }
}

public class new_java {
    public static void main(String[] args) {
        int[][] arr1  = {
            {1, 2, 3},
            {4, 5, 6},
        };
        int[][] arr2  = {
            {1, 4,4354, 435},
            {2, 5, 43543, 354},
            {3, 6, 435, 324},
        };
        int[][] newArr = new int[arr1.length][arr2[0].length];
        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr2[0].length; j++){
                for (int k=0; k<arr2.length; k++){
                    newArr[i][j] += arr1[i][k] * arr2[k][j];
                }
                System.out.print(newArr[i][j]+" ");
            }
            System.out.println();
        }
        
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1: 
                System.out.println(Day.sunday);
            case 2:
                System.out.println(Day.monday);
        }
    }
}
