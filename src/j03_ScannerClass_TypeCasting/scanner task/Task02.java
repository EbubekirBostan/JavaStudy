package j03_ScannerClass_TypeCasting.scanner;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Boyunuz cm cinsinden giriniz");
        double boy= input.nextDouble();
        System.out.println("Kilonuzu Kg Cinsinden Giriniz");
        double kilo=input.nextDouble();
        double vke=kilo/((boy/100)*(boy/100));
        System.out.println("VKE = " +(int)vke);
        System.out.println("VKE = " + vke);




    }
}
