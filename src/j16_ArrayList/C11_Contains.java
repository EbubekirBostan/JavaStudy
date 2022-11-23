package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_Contains {
    public static void main(String[] args) {
        //contains(); -> method list te istenen eleman varliğini kontrol eder boolean return eder
        ArrayList<String> listSehir=new ArrayList<>(List.of("Münih","Losangeles","Londra","Stockholm"));
        System.out.println("listSehir.contains(\"angara\") = " + listSehir.contains("angara"));//false
        System.out.println("listSehir.contains(\"Münih\") = " + listSehir.contains("Münih"));//true


    }
}
