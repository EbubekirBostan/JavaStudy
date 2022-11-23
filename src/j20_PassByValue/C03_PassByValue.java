package j20_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        Java non-primitive(Class,array list ->referans) data türlerinde objenin kendisi değilde dataları değişirse
         objenin referans ve kendisi değişmediği dataları değişikliğini kalıcı yapar.
         */
        //task>> list elemanları 24,20,87 iki farklı method ile list elemanlarını
        // update edip print eden code create ediniz.
        // 1. method for each kullansın 2. method set()
        List<Integer> list =new ArrayList<>(Arrays.asList(24,20,87));
        System.out.println("method öncesi = " + list);
        listUpdate1(list);
        listUpdate2(list);
        System.out.println("method sonrası = " + list);

    }
    public static void listUpdate1(List<Integer> list){
        for (Integer v:list){
            v*=2;
        }
        System.out.println("list = " + list);
    }
    public static void listUpdate2(List<Integer> list){
        for (int i = 0; i <list.size(); i++) {
            list.set(i,list.get(i)*2);
        }
        System.out.println("list = " + list);
    }


}
