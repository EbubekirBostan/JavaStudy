package Day08;

import java.util.Arrays;

public class Q02_Arrays {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * lari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */
        int nums[]= {1,2,3,4,5,6,7};
        int tpl=0;
        for (int i = 0; i < nums.length ; i++) {
            tpl+=nums[i];
        }
        int ortlm=tpl/ nums.length;
        System.out.println("ortlm = " + ortlm);
        System.out.println("ortalama üstü sayilar : ");

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i]>ortlm){
                System.out.print(nums[i]+" ");
            }
        }
    }
}
