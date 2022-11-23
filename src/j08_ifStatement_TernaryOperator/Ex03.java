package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        /*
        girilen bir yılın artık olmasını kontrol eden code create ediniz..
    artık yıl:
    Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
    Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
    Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Tarih Giriniz");
        int date=sc.nextInt();
        if ((date%4==0) && (date%100 !=0) || (date%400==0)) {
            System.out.println("girdiğiniz yıl artık yıldır");
        }else {
            System.out.println("girdiğiniz yıl artık yıl değildir");
        }














    }
}
