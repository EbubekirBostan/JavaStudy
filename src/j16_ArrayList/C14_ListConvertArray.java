package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C14_ListConvertArray {
    public static void main(String[] args) {
        // Listt'i Array 'a cevirme ->toArray();
        //1.yöntem -> toArray(); parametre olarak String[0] olarak yapılır.
        ArrayList<String> listUlke=new ArrayList<>(List.of("Alamanya","Amerikanya","Ingiltere","Isvec"));
        String arrUlke[]=listUlke.toArray(new String[0]);//ulkeList'i elemanları arrUlke olarak atandı
        System.out.println("listUlke = " + listUlke);
        System.out.println("Arrays.toString(arrUlke) = " + Arrays.toString(arrUlke));
        // 2. Yontem -> oluşturulan Array'in data type Object olarak atanır.
        // Trick>>> Object class java'da tüm class'ların parent(atası:Hz Adem)
        // Object Class java'da parent'ti olmayan tek Class'dir(tüm vagonları çeken ama çekilemez lokomotif)
        // String Integer Classlar Object Class child'i olduğu için istenen durumlarda data type olarak Object Class kullanılır
        Object arrUlkeler[]=listUlke.toArray();
        System.out.println("Arrays.toString(arrUlkeler) = " + Arrays.toString(arrUlkeler));



    }
}
