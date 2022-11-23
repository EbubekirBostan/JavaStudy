package j15_Arrays.odev;

import java.util.Arrays;

public class _20_Arrayboth_Ends {

    public static void main(String[] args) {

     /*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.

    Oluşturacağınız int array'i =   ([1, 2, 3, 4])

    Sonuç bu şekilde olmalıdır. [1, 4]
      */
        int arr[]={1,2,3,4};
        int nArr[]=new int[2];
        for (int i = 0; i < nArr.length ; i++) {
                nArr[i]=arr[(arr.length-1)*i];
           }
        System.out.println(Arrays.toString(nArr));


    }

}