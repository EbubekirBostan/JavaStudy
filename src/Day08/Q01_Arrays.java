package Day08;

import java.util.Arrays;

public class Q01_Arrays {
    public static void main(String[] args) {
        /*
      given an int array and find the squares of the elements
      (Verilen bir int dizisi icin elemanlarin karelerini bulun )
      Example:{2,6,4,5,8,9}
      output:{4,36,16,25,64,81}
      */
        int nums[]={2,6,4,5,8,9};
        for (int i = 0; i < nums.length ; i++) {
            nums[i]*=nums[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
