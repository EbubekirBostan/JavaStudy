package Day07;

import java.util.Scanner;

public class Q05_ForLoop {/* Kullanicidan sayilar girmesini isteyin
 * ve girdigi sayilari toplayip yazdirin.
 * yeni sayi isteyin
 * girilen sayilarin toplami 100 'u gecerse
 * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
 *
 */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int tpl=0;
        int sayac=0;
       while (tpl<100){
           System.out.println("Sayı Giriniz");
           int sayi=sc.nextInt();
           tpl+=sayi;
           sayac++;
       }
        System.out.println("sayıların toplamı: "+tpl+" adedi: "+sayac);





    }
}
