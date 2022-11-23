package j15_Arrays.odev;

import java.util.Arrays;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */
        int numbers[]={12,2,5,15,8};
        int mxelmn =numbers[0];
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i]>mxelmn){
                mxelmn=numbers[i];
            }
        }
        System.out.println("mxelmn = " + mxelmn);//mxelmn = 15


    }
}

