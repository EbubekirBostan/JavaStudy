package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_distinct {
    public static void main(String[] args) {
        //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
        // Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
        // Sıralı akışlar için, farklı elemanın seçimi sabittir
        // (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
        // Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.
        List<String > menu = new ArrayList<String>(Arrays.asList("küşleme","soğanlı","trileçe","küşleme","soğanlı","trileçe","bicibici","büryan","melemen","cacix","kokerç","yağlama","güveç","arabAşı","tantuni"));
        alfBkTkszPrint(menu);
        System.out.println("\n******");
        karakterSayisiTersSiraliTekrarsiz(menu);
        System.out.println("\n******");
        karakterSayisiSiraliTekrarsiz(menu);
        System.out.println("\n******");
        sonHarfTersSirali(menu);
        System.out.println("\n******");
        ciftSyiliKareTkrsizBk(menu);

    }//main sonu
    //Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void alfBkTkszPrint(List<String > menu){
        menu.
                stream().map(String::toUpperCase).
                sorted().distinct().forEach(C01_LambdaExpression::yazdirString);
    }
    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void karakterSayisiTersSiraliTekrarsiz(List<String > menu){
        menu.stream().map(t->t.length()).sorted(Comparator.reverseOrder()).distinct().forEach(C01_LambdaExpression::yazdir);
        System.out.println("*****");
        menu.stream().map(String::length).sorted(Comparator.reverseOrder()).distinct().forEach(C01_LambdaExpression::yazdir);

    }
// Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz..
public static void karakterSayisiSiraliTekrarsiz(List<String > menu){
    menu.stream().sorted(Comparator.comparing(String::length)).forEach(C01_LambdaExpression::yazdirString);

}
    // Task : list elemanlarinin son harfine gore ters sirali print ediniz.
    public static void sonHarfTersSirali(List<String > menu) {
        menu.stream().
                sorted(Comparator.comparing(t -> t.toString().charAt(t.toString().length() - 1)).reversed()).
                forEach(C01_LambdaExpression::yazdirString);

    }
    // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz...
    public static void ciftSyiliKareTkrsizBk(List<String > menu){
        menu.stream().
                map(String::length).
                filter(C01_LambdaExpression::ciftMi).
                map(C01_LambdaExpression::karesi).
                sorted(Comparator.reverseOrder()).
                distinct().
                forEach(C01_LambdaExpression::yazdir);
    }




}
