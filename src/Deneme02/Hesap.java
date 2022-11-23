package Deneme02;

import java.util.Scanner;

public class Hesap {
    double x;
    double y;
    char secim;

    public Hesap(double x, double y, char secim) {
        this.x = x;
        this.y = y;
        this.secim = secim;
    }

    public Hesap() {
    }


    public double toplama(double x, double y) {
        return x + y;
    }

    public double carpma(double x, double y) {
        return x * y;
    }

    public double cikarma(double x, double y) {
        return x - y;
    }

    public double bolme(double x, double y) {
        return x / y;
    }

    public void giris() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hangi işlemi yapmak istiyorsunuz (+) (-) (*) (/)");
        secim = sc.next().charAt(0);
        System.out.print("İlk sayıyı Giriniz: ");
        x = sc.nextInt();
        System.out.print("ikinci sayıyı Giriniz: ");
        y = sc.nextInt();
        hesapla();

    }

    public void hesapla() {
        switch (secim) {
            case '+':
                System.out.println("Toplama Sonucu = " + toplama(x, y));
                break;
            case '-':
                System.out.println("Cikarma Sonucu = " + cikarma(x, y));
                break;
            case '*':
                System.out.println("Carpma Sonucu = " + carpma(x, y));
                break;
            case '/':
                System.out.println("Bolme Sonucu = " + bolme(x, y));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız");
                break;
        }


    }
}


