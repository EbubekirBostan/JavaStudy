package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArrayConvertList {
    public static void main(String[] args) {
        //King of Trick-> Array'dan çevrilen List array kaynaklı olduğu için array davranışı
        // gösterir boyut sabittir dolayısıyla "remove", "clear" ve "add" methodu çalışmaz. y
        String arrJavaCAN[]={"Akif","Gamze","Musty","SevdeNur"};
        List<String> listJavaTar= Arrays.asList(arrJavaCAN);// arrJavaCAN değerleri list eleman olarak atandı.
        System.out.println("listJavaTar = " + listJavaTar);
        System.out.println("listJavaTar.size() = " + listJavaTar.size());
        //listJavaTar.add("sefil bilo");//array a eleman eklenmez...
        // TRİCKKKK -> List data type Array list tanımlanırsa Runte vermez kaynağı array de olsa list davranır.
        //boyut esnekliği yapar.
        ArrayList<String> listJavaTar1=new ArrayList<>(Arrays.asList(arrJavaCAN));
        listJavaTar1.add("sefil bilo");
        System.out.println("listJavaTar1 = " + listJavaTar1);


    }
}
