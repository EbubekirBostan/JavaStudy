package j15_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //Array Copy... copyOf(arr,newlenght); ->> girilen arrayin newLenght kadar ilk elemanını copyalar.
        int sayi[]={63,21,47,27,35,12,36,31,46,24};
        int yeniArr[]= Arrays.copyOf(sayi,5);
        System.out.println("sayıdan 5 eleman kopyalanan: "+Arrays.toString(yeniArr));//[63, 21, 47, 27, 35]
        int baskaArr[]=Arrays.copyOfRange(sayi,3,8);//3 dahil 8 hariç index elemanlar kopyalanır->[27, 35, 12, 36, 31]
        System.out.println(Arrays.toString(baskaArr));

        //Arrayin Belirli bir eleman ile Set(update) etme...fill(arr,value);
        Arrays.fill(sayi,99);//bütün indexler 99 olur
        System.out.println(Arrays.toString(sayi));//[99, 99, 99, 99, 99, 99, 99, 99, 99, 99]
        Arrays.fill(sayi,3,7,33);//3.4.5.6. index elemanlar 33 ile update edildi.
        System.out.println(Arrays.toString(sayi));//[99, 99, 99, 33, 33, 33, 33, 99, 99, 99]




    }
}
