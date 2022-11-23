package Day07;

import java.util.Scanner;

public class Q03_NestedForLoop {
    /*
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
    girilen sayı dahil(tek ise), tek olanlarin adet yazdiralim
   */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi=sc.nextInt();
        int count=0;
        for (int i = 0; i <=sayi ; i++) {
            if (i%2==1){
                System.out.println("Tek sayı: "+i);
                count++;
            }
        }
        System.out.println();
        System.out.println("Sayıların adedi: "+count);





    }
}
