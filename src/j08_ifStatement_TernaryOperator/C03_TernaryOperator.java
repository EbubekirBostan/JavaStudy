package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {
        /* Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
 ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
 Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
 daha basic code'lar bulunur.

 */
        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz");
        int sayi=sc.nextInt();
       //String sonuc=(sayi%2==0 ? "Sayı Çift" : "Sayi Tek");
       //System.out.println("sonuc = " + sonuc);
        /*
        TRİCK>>>Ternary operatör işlem sonucunda true veya false göre bir çıktı verir
        eğer bu çıktı type göre bir variable atanmazsa sout ile doğrudan print edilmeli.
         */
        // girilen tam sayının negatif olmasını kontrol edn bir code create ediniz

        String sonuc=(sayi<0 ? "Sayi negative" : "Sayi Pozitif");
        System.out.println("sonuc = " + sonuc);


    }
}
