package j99_Lambda;

import java.util.*;
import java.util.stream.Stream;

public class C08_limit {
    public static void main(String[] args) {
        //limit(a) akısdan cıkan elemanları a parametresine gore ilk a elamanı alır.
        List<String > menu = new ArrayList<String>(Arrays.asList("küşleme","soğanlı","trileçe","küşleme","soğanlı","trileçe","bicibici","büryan","welemen","cacix","kokerç","yağlama","güveç","arabAşı","tantuni"));
        enBuyukEleman(menu);
        System.out.println("******");

    }
    // Task : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void enBuyukEleman(List<String > menu){
        Stream<String> eleman=menu.stream().sorted(Comparator.comparing(String::length).reversed()).
                limit(1);//akışdaki ilk 1 eleman alındı
        System.out.println(Arrays.toString(eleman.toArray()));//limit meth bir stream yapı akışı birden çok eleman return eder
        //dolayısıyla limit cıktısı doğrudan sout ile print edilemez. Limit çıktısı list veya array gibi bir coll. atıp yazdırırız
        Object[] enbykKrktrarr = menu.stream().sorted(Comparator.comparing(String::length).reversed()).
                limit(1).toArray();
        System.out.println(Arrays.toString(enbykKrktrarr));
      Optional<String> enBEleman=menu.stream().sorted(Comparator.comparing(String::length).reversed()).
                findFirst();
        System.out.println(enBEleman);

    }

}
