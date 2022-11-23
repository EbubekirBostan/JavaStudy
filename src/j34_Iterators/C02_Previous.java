package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_Previous {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>(Arrays.asList(24,38,65,9,11,7,27,23));
        //l1 elemanlarını tersten print ediniz
        System.out.println("l1 list ilk hali : "+l1);
        /*
        Tekrarda son elemandan başlayan işlemler için pointer en sona götürülmeli
        Bunun için pointeri sona götüren hasnext() meth çalışmalı
         */
        ListIterator<Integer> it= l1.listIterator();
        while (it.hasNext()){//baştan sona sürekli ilerler
            it.next();
        }
        while (it.hasPrevious()){//sondan başa doğru ilerler
            System.out.print(it.previous()+ " ");
        }
     //   System.out.println();
    //    System.out.println("l1 list tersten hali : "+l1);
        List<String> l2=new ArrayList<>(Arrays.asList("cagla","uğur","muharrem","cebrail"));
        System.out.println("l2 = " + l2);
        //l2 elemanlarının sonuncusuna :-) ekleyip print ediniz
        ListIterator<String> it1=l2.listIterator();//l2 elemanlarını tekrarlayan listiterator tanımlandı
        while (it1.hasNext()){
            String s=it1.next();
            if (!it1.hasNext())// son eleman sonrasında eleman yoksa o son elemandır
            it1.set(s+ ":-)");
        }
        System.out.println("l2 = " + l2);//l2 = [cagla, uğur, muharrem, cebrail:-)]

        /*
        hasPrevious() meth için MUTLAKA KESİNLİKLE hasnext() ve next() methodları çalıştırılarak cursor(pointer)
        en sona getirilmeli.

        ITERATOR VE LISTITERATOR FARKLARI
        1-ITERATOR-> sadece hasnext(), next(), remove() meth çalışır
           LISTITERATOR->hasnext(), next(), remove(), hasPrevious(), previous(),add(),set() vs methodlar çalışır

        2- LISTITERATOR-> sadece List yapılarda tanımlanır.
            ITERATOR-> tüm Colection(list set Array, map...) için tanımlanır

         3- ITERATOR-> sadece ileri baştan sona
            LISTITERATOR-> ileri ve geri çift yönlü tekrarlar

            ITERATOR->kapsamı geniş ama methodları az
            LISTITERATOR->kapsamı dar ama methodları fazla
         */


    }
}
