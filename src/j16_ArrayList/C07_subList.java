package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_subList {
    public static void main(String[] args) {
        ArrayList<String> listSehir=new ArrayList<>(List.of("Münih","Losangeles","Londra","Stockholm","Angara","Patagonya"));
        //subList(); -> listin istenen list parçasını return eder
        System.out.println(listSehir.subList(3, 5));//3.4. index elemanları listi verir
        List<String> city=new ArrayList<>(listSehir.subList(2,5));
        System.out.println("city = " + city);//city = [Londra, Stockholm, Angara]
    }
}
