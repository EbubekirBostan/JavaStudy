package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C13_replaceAll_fill {
    public static void main(String[] args) {
        // rplaceAll();->Listte belirli bir elemanı belirli bir değer iele update eder.
        List<Integer> listSayi=new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));
        System.out.println("listSayi = " + listSayi);//[1, 24, 23, 14, 19, 60, 1, 55, 27, 1, 38]
        Collections.replaceAll(listSayi,1,20);// sayı listine 1 yerine 20 değeri atandı
        System.out.println("listSayi = " + listSayi);//[20, 24, 23, 14, 19, 60, 20, 55, 27, 20, 38]
        //fill(); -> Listte tüm elemanları belirli bir değere update eder.
        Collections.fill(listSayi,33);
        System.out.println("listSayi = " + listSayi);//fill sonrası->[33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33]





    }
}
