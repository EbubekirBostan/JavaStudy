package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        /*
        TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
        ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldığı 100000km ve üzeri ise kontak anahtarını veriniz
        aksi durumda tecrübe tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("Ehliyetiniz var ise 'E' yoksa 'H' giriniz ");
        char ehliyet=sc.next().toUpperCase().charAt(0);//kullanıcının girdiği karakteri büyük harfe çevir ilkini getir
        if (ehliyet=='E') {// ehliyet kontrol edildi
            System.out.println("kaç yıllık tecrübeniz var");
            int tcrb = sc.nextInt();
            if (tcrb >= 7) {// tecrübe kontrol edildi
                System.out.println("Yaptığınız km yi giriniz : ");
                int km = sc.nextInt();
                if (km >= 100000) {//km kontrol edildi
                    System.out.println("Kontak anahtarı senindir");
                } else// km şartı sağlamazsa çalışır
                    System.out.println("kontak anahtarı almanız için " + (100000 - km) + "km'ye ihtiyacınız var");//
            } else // tecrübe şartı sağlamazsa çalışır
                System.out.println("kontak anahtarı almanız için  " + (7 - tcrb) + "yıla ihtiyacınız var");
        } else if (ehliyet=='H') {// ehliyet yokluğu kontrol edildi
            System.out.println("Önce ehliyet alınız");
        }else System.out.println("yanlış karakter girdiniz");// karakter hatası kontrol edildi
















    }
}
