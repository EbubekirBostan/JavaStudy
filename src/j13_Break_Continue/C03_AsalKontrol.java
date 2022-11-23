package j13_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {
        //task>> girilen sayının asallığını kontrol et
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı Giriniz= ");
        int num = sc.nextInt();
        boolean asalMi = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {// eğer sayı kendisine kadar olan sayılara tam bölünüyorsa
                asalMi = false;
                break;
            }
        }
        if (asalMi && num!=1) {
            System.out.println("girilen sayi ASAL");
        } else System.out.println("girilen sayi ASAL değil");

    }
}
