package j16_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.   Parametre olarak integer ArrayList.      Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;        ArrayList   --  5,3,4,6,7        CEVAP : 6
     */

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(5, 3, 4, 6, 7));
        System.out.println("secondMax(nums) = " + secondMax(nums));
    }

    private static int secondMax(List<Integer> nums) {
       int max=0;
       int sayi=0;
       int max2=2;
      while (sayi<max2){
             max=nums.get(0);
            for (int a:nums)
                if (a>max)
                    max=a;
                    nums.remove(nums.indexOf(max));
                    sayi++;
      }
        return max ;
    }
}



