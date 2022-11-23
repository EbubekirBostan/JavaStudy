package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {
        ArrayList<String> listUlke=new ArrayList<>(List.of("Alamanya","Amerikanya","Ingiltere","Isvec"));
        ArrayList<String> listSehir=new ArrayList<>(List.of("Münih","Losangeles","Londra","Stockholm"));
        //nCopies(int,Obj); -> int elemanlı bir obj den oluşan list ataması yapıyor
        ArrayList<String> yeniList=new ArrayList<>(Collections.nCopies(3,"javaCAN"));
        System.out.println("yeniList = " + yeniList);//yeniList = [javaCAN, javaCAN, javaCAN]
        // addAll(); -> bir listE diğer listi olduğu gibi ekler
        listUlke.addAll(listSehir);
        System.out.println("listUlke = " + listUlke);//listUlke = [Alamanya, Amerikanya, Ingiltere, Isvec, Münih, Losangeles, Londra, Stockholm]
        listSehir.addAll(3,listUlke);//3.indexten itibaren ülke listi şehir liste tamamen eklendi
        System.out.println("listSehir = " + listSehir);//listSehir = [Münih, Losangeles, Londra, Alamanya, Amerikanya, Ingiltere, Isvec, Münih, Losangeles, Londra, Stockholm, Stockholm]
        //task-> 1 den 10 kadar sayıları bir liste atayıp print eden code create ediniz
        ArrayList<Integer> listSayı=new ArrayList<>();
        for (int i = 1; i <=10 ; i++) {
            listSayı.add(i);
        }
        System.out.println("listSayı = " + listSayı);//listSayı = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]



    }
}
