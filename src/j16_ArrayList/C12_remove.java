package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C12_remove {
    public static void main(String[] args) {
        //remove(); -> List ten istenen elemanı siler
        ArrayList<String> listSehir=new ArrayList<>(List.of("Münih","LosAngeles","Londra","Stockholm"));
        System.out.println(listSehir.remove("angara"));//false
        System.out.println(listSehir.remove("Londra"));//true
        System.out.println(listSehir.remove(1));//LosAngeles
       // System.out.println(listSehir.remove(11));//olmayan indexte runte verir
        System.out.println("listSehir = " + listSehir);//listSehir = [Münih, Stockholm]
        listSehir.add("Münih");
        listSehir.add("Angara");
        listSehir.add("Münih");
        System.out.println("listSehir = " + listSehir);//[Münih, Stockholm, Münih, Angara, Münih]
        listSehir.remove("Münih");// tekrarlı da ilk eleman siler
        System.out.println("listSehir = " + listSehir);//listSehir = [Stockholm, Münih, Angara, Münih]
        ArrayList<String> listUlke=new ArrayList<>(List.of("Alamanya","Amerikanya","Ingiltere","Isvec"));
        listSehir.addAll(listUlke);// şehir liste ülke list eklendi
        System.out.println("listSehir = " + listSehir);// yazdırıldı
        listSehir.removeAll(listUlke);// sehirlistten ulkeler cıkarıldı
        System.out.println("listSehir = " + listSehir);// ulkeler cıkarılıp yazdırıldı





    }
}
