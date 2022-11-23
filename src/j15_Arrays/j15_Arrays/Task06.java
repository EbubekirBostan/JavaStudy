package j15_Arrays.j15_Arrays;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz

        int arr[]= {3,5,6,1,9,45,25,4,9,0};

        System.out.println(buyukKuccuk(arr));
    }

    public static String buyukKuccuk(int[] arr) {
        Arrays.sort(arr);
        int yArr[]=new int[arr.length];
        for (int i =0; i < arr.length ; i++) {
            yArr[i]=arr[(arr.length-1)-i];
        }
        return Arrays.toString(yArr);
    }
}
