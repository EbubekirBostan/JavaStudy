package J04_AritmeticOperators.aritmeticodev;

import java.util.Scanner;

public class Task05 {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saniyeyi Giriniz");
        int s=sc.nextInt();
        int saat=s/3600;
        int dk=s%3600/60;
        int san=s%60;
        System.out.println("saat = " + saat);
        System.out.println("dk = " + dk);
        System.out.println("san = " + san);


    }

}
