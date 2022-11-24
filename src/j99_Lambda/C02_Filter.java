package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Filter {
    public static void main(String[] args) {
        List<Integer> sayi=new ArrayList<>(Arrays.asList(24,38,49,33,7,3,42,66,75,45,46,55,35,25,67,16));
        printCiftElStructured(sayi);//24 38 42 66 46 16
        System.out.println("\n******");
        printCiftElFunctional(sayi);//24 38 42 66 46 16
        System.out.println("\n******");
        printCiftElFunctional1(sayi);//24 38 42 66 46 16
        System.out.println("\n******");//24 16
        printCiftElFunctional2(sayi);
        System.out.println("\n******");
        printCiftElFunctional3(sayi);//24 16
    }
    //Task : "Structured Programming" kullanarak list elemanlarının çiftlerini aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void printCiftElStructured( List<Integer> sayi){
        for (Integer w:sayi){
            if (w%2==0){
                System.out.print(w+" ");
            }
        }
    }
//Task : "Functional Programming" kullanarak list elemanlarının çiftlerini aynı satirda aralarında bosluk olacak sekilde print ediniz.
public static void printCiftElFunctional( List<Integer> sayi){
   sayi.
           stream().//List elemanları akışa alındı
           filter(t->t%2==0).//akışdaki list elemanları çift olma şartına göre filtrelendi:akışdan çıkarıldı->lambda exp ..bad practice
           forEach(C01_LambdaExpression::yazdir);//C01 Class'daki yazdır method refere(call)edildi
}
    public static void printCiftElFunctional1( List<Integer> sayi){
        sayi.
                stream().//List elemanları akışa alındı
                filter(C01_LambdaExpression::ciftMi).//akışdaki list elemanları çift olma şartına göre filtrelendi:akışdan çıkarıldı->best practice
                forEach(C01_LambdaExpression::yazdir);//C01 Class'daki yazdır method refere(call)edildi
    }
//Task : "Functional Programming" kullanarak list elemanlarının çiftlerini 35 den küçük olanlarınıaynı satirda aralarında bosluk olacak sekilde print ediniz.
            public static void printCiftElFunctional2( List<Integer> sayi){
             sayi.
            stream().//List elemanları akışa alındı
            filter(t-> t<35 && t%2==0).//akışdaki list elemanları çift olma şartına göre filtrelendi:akışdan çıkarıldı->
            forEach(C01_LambdaExpression::yazdir);//C01 Class'daki yazdır method refere(call)edildi
        }
    public static void printCiftElFunctional3( List<Integer> sayi){
        sayi.
                stream().//List elemanları akışa alındı
                filter(C01_LambdaExpression::ciftMi).
                filter(C01_LambdaExpression::kück35).//akışdaki list elemanları çift olma şartına göre filtrelendi:akışdan çıkarıldı->
                forEach(C01_LambdaExpression::yazdir);//C01 Class'daki yazdır method refere(call)edildi
    }
    //Task : "Functional Programming" kullanarak list elemanlarının çiftlerini 34 den büyük olanlarınıaynı satirda aralarında bosluk olacak sekilde print ediniz.






}
