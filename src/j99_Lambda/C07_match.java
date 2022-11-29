package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_match {
    public static void main(String[] args) {
        List<String > menu = new ArrayList<String>(Arrays.asList("küşleme","soğanlı","trileçe","küşleme","soğanlı","trileçe","bicibici","büryan","welemen","cacix","kokerç","yağlama","güveç","arabAşı","tantuni"));
        hrfSys7DenAzKontrol(menu);
        System.out.println("\n******");
        wIleBaslayanKontrol(menu);
        xIleBaslayanKontrol(menu);

    }
    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
//allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
//noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

// Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.

    public static void hrfSys7DenAzKontrol(List<String > menu){
      boolean kontrol=menu.stream().allMatch(t->t.length()<=7);
      if (kontrol){
          System.out.println("agam menudekiler 7 ve daha az harften oluşuyor");
      }else System.out.println("agam menudekiler 7 karakterden fazla...");
        //System.out.println(kontrol?"agam menudekiler 7 ve daha az harften oluşuyor":"agam menudekiler 7 karakterden fazla...");
    }
// Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.
public static void wIleBaslayanKontrol(List<String > menu){
    System.out.println(menu.stream().
            noneMatch(t -> t.startsWith("w"))
            ? "agam w ile başlayan yemah olur mu"
            : "agam wenemen ne menem bişey");
}
// Task : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.
            public static void xIleBaslayanKontrol(List<String > menu){
                 System.out.println(menu.stream().
                    anyMatch(t->t.endsWith("x"))
                  ? "agam senden bir cacix olmaz olamaz"
                   : "agam senin yemahhh bu topraklarda yoğğğ :)");
    }


}
