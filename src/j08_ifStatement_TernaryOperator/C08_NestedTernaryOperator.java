package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C08_NestedTernaryOperator {
    public static void main(String[] args) {
        /*
 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
       %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Ürün Miktarını Giriniz");
        int a=scan.nextInt();
        System.out.println("Ürün Birim Fiyatını Giriniz");
        int b=scan.nextInt();
        double fatura=(a > 100 ? a - (a * 33 / 100) : a*b);
        System.out.println("fatura = " + fatura);


    }
}
