package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_set {
    public static void main(String[] args) {
        //set();-> listin istenen indexe istenen elemanı update eder.
        ArrayList<String> listSehir=new ArrayList<>(List.of("Münih","Losangeles","Londra","Stockholm"));
        System.out.println(listSehir.set(3, "Angara"));//Stockholm burda set edilen değer print edilir
        System.out.println(listSehir);//[Münih, Losangeles, Londra, Angara] burda set edilmiş hali olur
        //System.out.println(listSehir.set(11, "patagonya"));// olmayan index set edilirse runte verir
        System.out.println(listSehir);
        //listSehir.set(1,"bursa",2,"izmir");-> list te çoklu set modu çalışmaz CTE verir.


    }
}
