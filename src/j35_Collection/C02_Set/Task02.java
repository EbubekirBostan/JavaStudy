package j35_Collection.C02_Set;

import java.util.HashSet;
import java.util.TreeSet;

public class Task02 {
    public static void main(String[] args) {
        //alfabetik sıra isteniyorsa tree sete atıp elemaları teke indirebiliriz.
        //hashset ve tree set tanımlayıp run sürelerini karşılaştırınız.
        //Trick run süresi için System.currentTimeMilis() meth call ediniz
        long tsBasla=System.currentTimeMillis();
        TreeSet<Integer> ts=new TreeSet<>();
        for (int i = 0; i <1000000 ; i++) {
            ts.add(i);
        }
        long tsBitir=System.currentTimeMillis();
        System.out.println("tsBitir-tsBasla = " + (tsBitir - tsBasla));
        long hsBasla=System.currentTimeMillis();
        HashSet<Integer> hs=new HashSet<>();
        for (int i = 0; i <1000000 ; i++) {
            hs.add(i);
        }
        long hsBitir=System.currentTimeMillis();
        System.out.println("hsBitir-hsBasla = " + (hsBitir - hsBitir));


    }

}
