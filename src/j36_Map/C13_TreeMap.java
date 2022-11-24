package j36_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class C13_TreeMap {
    public static void main(String[] args) {
        /*
        TreeMap->
        1- TreeMap key'lerde null değer tanımlanamaz. Fakat value'larda null değer tanımlanabilir
        2- TreeMap elemanlarının key NATUREL ORDER'a göre tanımlanır.
        3- TreeMap synchronized ve thread-safe değildir.
        4- TreeMap en yavaş map türüdür. Kullanılırken çoook dikkat edilmeli...
         */
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(105,"Emine");
        tm.put(101,"Uğur");
        tm.put(102,"Enise");
        tm.put(103,"Kevser");
        tm.put(104,"Fatih");

        System.out.println("tm = " + tm);//Naturel sıralama key'e göre yapar
       // tm.put(null,"Fatih");//NullPointerException
        tm.put(104,"Hüma");
        tm.put(106,null);
        tm.put(107,null);
        System.out.println("tm = " + tm);//tm = {101=Uğur, 102=Enise, 103=Kevser, 104=Hüma, 105=Emine, 106=null, 107=null}
        HashMap<String, String> hm = new HashMap<>();
        //map.keySet();->map key değerlerini Set'e atayıp return eder.
        //map.values();->map value değerlerini coll. atayıp return eder.
        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm = " + hm);
        TreeMap<String, String> tm1=new TreeMap<>(hm);//hm TreeMap e atanarak
       // TreeMap<String, String> tm2=hm; //Cte ->datatype miss-Match
        System.out.println("tm1 = " + tm1);//tm1 = {Amazon=296 Euro, Apple store=333 Euro, Ebay=234 Euro, MediaMarkt=183 Euro, Saturn=300 Euro, Vatan=111 Euro}
        System.out.println(tm.ceilingKey(103));//103//ceilingKey()-> method parametre olarak girilen key değer map de varsa return eder
        //yoksa parametreden büyük en küçük key değerini return eder
        // parametre map''de yok ve parametreden büyük en küçük key de yoksa null return eder
        //ceilingKey(key)-> en kucuk abi-abla
        System.out.println(tm.ceilingKey(108));//null
        System.out.println(tm.ceilingKey(100));//101
        System.out.println(tm.ceilingKey(1));//101// map de bulunan 1'den buyuk en küçük key 101
        System.out.println(tm.ceilingKey(110));//null -> 110 dan buyu en küçük key yok

        //keySet() -> ascending order -> artan sıralama
        //descendingKeySet() -> descending order -> azalan sıralama
        System.out.println("tm.descendingKeySet() = " + tm.descendingKeySet());//tm.descendingKeySet() = [107, 106, 105, 104, 103, 102, 101]
        System.out.println("tm.keySet() = " + tm.keySet());//tm.keySet() = [101, 102, 103, 104, 105, 106, 107]
        System.out.println("tm.firstKey() = " + tm.firstKey());//tm.firstKey() = 101
        System.out.println("tm.lastKey() = " + tm.lastKey());//tm.lastKey() = 107


    }
}
