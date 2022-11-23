package Day09;

import java.util.Arrays;

public class Q05_ArrayList {
    public static void main(String[] args) {
        /*
   Find the middle element in an integer array
   Example:  (10, 5, 6) ==> (5, 6, 10) ==> Output=6
             (16, 5, 8, 10) ==> (5, 8, 10, 16) ==> Output=(8+10)/2 = 9
*/
        int arr []={16,5,8,10,21,12};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int ortanca=arr.length/2;
        if (arr.length%2==0){
            ortanca=(arr[(ortanca)]+arr[(ortanca)-1])/2;
        }else
            ortanca=arr[ortanca];
        System.out.println("ortanca = " + ortanca);
    }
}
