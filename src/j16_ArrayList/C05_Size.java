package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_Size {
    public static void main(String[] args) {
        // size(); -> listin eleman sayısını return eder(arr->lenght
        ArrayList<String> listSehir=new ArrayList<>(List.of("Münih","Losangeles","Londra","Stockholm"));
        System.out.println(listSehir.size());//4
    }
}
