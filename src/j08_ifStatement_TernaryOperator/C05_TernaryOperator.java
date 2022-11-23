package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {
        /*
        girilen bir tamsayı çiftse  yarısını değilse
        girilen sayı tek olduğu için yarısı tamsayı değildir print eden code yazınız
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int a=scan.nextInt();

       // String sonuc;
      //  sonuc=(a%2==0)? a/2 : "Sayı tek oldugu için bölünmez";
        /*
        TRİCK>>> Ternary iki durum(T/F) için farklı data type çıktısı veriyorsa
        variable atama yapmadan sout yapılmalı yada ternary çıktısı aynı data
        type serializable edilmeli.
         */
        System.out.println((a%2==0)? a/2 : "Sayı tek oldugu için bölünmez");

















    }
}
