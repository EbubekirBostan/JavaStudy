package j15_Arrays.odev;

import java.util.Arrays;

public class _13_Advance_zeroFront {

    public static void main(String[] args) {

      /*

   Verilen Array tam olarak aynı sayıları içeren, ancak tüm sıfırların dizinin başında gruplandırılması
   için yeniden düzenlenmiş bir Array döndürün.
   Sıfır olmayan sayıların sırası önemli değildir.
   Böylece {1, 0, 0, 1} {0, 0, 1, 1} olur. Verilen diziyi değiştirebilir ve döndürebilir veya yeni bir dizi oluşturabilirsiniz.

   Bu şekilde bir Array oluşturunuz: 1,0,0,1,0
   Sonuç böyle olmalı :  0,0,0,1,1

       */

        int zerone[]={1,0,0,1,0};

        int[] arr6={1,0,1,0,1};
        for (int i = 0; i < arr6.length; i++) {
            for (int j = i+1; j <arr6.length; j++) {
                if(arr6[i]!=0&&arr6[j]==0){
                    int temp=arr6[i];
                    arr6[i]=arr6[j];
                    arr6[j]=temp;
                }
            }
        }System.out.println(Arrays.toString(arr6));


    }
}