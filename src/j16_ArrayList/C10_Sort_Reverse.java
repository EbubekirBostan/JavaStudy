package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C10_Sort_Reverse {
    public static void main(String[] args) {
        //Collections.sort(list); -> werilwn listi naturel sıralama yapar.Ascii değere göre sıralama yapar
        //Collections.reverse(list); -> werilwn listin ters sıralamasını return eder.
        ArrayList<String> listSehir=new ArrayList<>(List.of("Münih","Losangeles","Londra","Stockholm"));
        System.out.println("listSehir = " + listSehir);
        Collections.sort(listSehir);//Trick** sort methodu sout içinde çalışmaz
        System.out.println("listSehir = " + listSehir);
        Collections.reverse(listSehir);//Trick** reverse methodu sout içinde çalışmaz.
        System.out.println("listSehir = " + listSehir);

    }
}
