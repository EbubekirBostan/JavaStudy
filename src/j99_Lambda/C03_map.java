package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_map {
    public static void main(String[] args) {
        List<Integer> sayi=new ArrayList<>(Arrays.asList(24,38,49,33,7,3,42,66,75,45,46,55,35,25,67,16));
        ciftKarePrint(sayi);//576 1444 1764 4356 2116 256
        System.out.println("\n******");
        küp1FazlasıPrint(sayi);//117650 35938 344 28 421876 91126 166376 42876 15626 300764
        System.out.println("\n******");
        kareKokPrint(sayi);//4 6 6 8 6 4
    }//main sonu
    // Task : Functional Programming ile listin cift elemanlarinin  karelerini ayni satirda aralarina bosluk bırakarak print ediniz
    public static void ciftKarePrint(List<Integer> sayi){
        sayi.
                stream().
                filter(C01_LambdaExpression::ciftMi).
                map(t->t*t).
                forEach(C01_LambdaExpression::yazdir);
    }
    // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edi

    public static void küp1FazlasıPrint(List<Integer> sayi){
        sayi.
                stream().
                filter(C01_LambdaExpression::tekMi).
                map(C01_LambdaExpression::küp1fazlası).
                forEach(C01_LambdaExpression::yazdir);
    }
    // Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void kareKokPrint(List<Integer> sayi){
        sayi.
                stream().
                filter(C01_LambdaExpression::ciftMi).
                map(C01_LambdaExpression::kareKok).
                forEach(C01_LambdaExpression::yazdir);
    }
}
