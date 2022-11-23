package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Get {
    public static void main(String[] args) {
        // get(); -> listte istenen index elemanı return eder.(arr[3] tekş gibi arr nin 3. indexini getirir).
        ArrayList<String> listSehir=new ArrayList<>(List.of("Münih","Losangeles","Londra","Stockholm"));
        System.out.println(listSehir.get(1));//losangeles
        System.out.println(listSehir.get(11));//olmayan index elemanı RunTe verir


    }
}
