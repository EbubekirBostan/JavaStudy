package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C09_skip {
    public static void main(String[] args) {
        //skip(n) => atlama demek. Akışın ilk n elemanını attıktan sonra bu akışın kalan elemanlarından oluşan
        // bir akış return eder.
        //akış n den daha az eleman içeriyorsa skip(n) meth dan sonra boş akış return eder.
        //skip(n) ara işlemdir
        List<String > menu = new ArrayList<String>(Arrays.asList("küşleme","soğanlı","trileçe",
                "bicibici","büryan","welemen","cacix","kokerç","yağlama","güveç","arabAşı","tantuni"));
        sonHarfIlkIkiELHaric(menu);
        System.out.println("******");
    }
    // Task : list elemanlarini son harfine göre siralayıp ilk iki eleman hariç kalan elemanlari print ediniz.
    public static void sonHarfIlkIkiELHaric(List<String > menu){

        System.out.println(Arrays.asList(
                menu.
                stream().
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).//akışdaki elemanların son karakterine göre sıralandı
                skip(2).// akışdaki ilk iki eleman akışdan atıldı
                        toArray()));// akış elemanları bir araya atandı
        menu.
                stream().
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                skip(2).
                forEach(t-> System.out.print(t+" "));
    }



}
