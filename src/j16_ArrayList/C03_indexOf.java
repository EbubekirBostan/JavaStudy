package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        //indexOf(); -> list içinde istenen elemanın index değerini return eder
        ArrayList<String> listUlke=new ArrayList<>(List.of("Alamanya","Amerikanya","Ingiltere","Isvec"));
        ArrayList<String> listSehir=new ArrayList<>(List.of("Münih","Losangeles","Londra","Stockholm"));
        System.out.println(listSehir.indexOf("Londra"));//2
        System.out.println(listSehir.indexOf("Lo"));//-1 List'te olmayan eleman indexi -1 return eder "case sensitive" dir.
        listUlke.add("Amerikanya");
        System.out.println(listUlke.indexOf("Amerikanya"));//1 -> tekrarlı elemanlarda soldan ilk eleman index'i return eder
        System.out.println(listUlke.lastIndexOf("Amerikanya"));//4 sondan bakıp indexini verir


    }
}
