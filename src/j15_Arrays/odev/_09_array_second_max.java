package j15_Arrays.odev;

import java.util.Arrays;

public class _09_array_second_max {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */
        int nums[]={15,25,22,18,30};
        Arrays.sort(nums);
        System.out.println(nums[nums.length-2]);//25
    }
}
