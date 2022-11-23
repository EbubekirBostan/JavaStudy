package J04_AritmeticOperators.aritmeticodev;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saniyeyi Giriniz");
        int s = sc.nextInt();
        int st = s/3600;
        int dk = s%3600/60;
        int sny =s%3600%60;
        System.out.println("saat = " + st);
        System.out.println("dk   = " + dk);
        System.out.println("sny  = " + sny);


    }
}
