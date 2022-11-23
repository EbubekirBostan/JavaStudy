package j12_Loops.L01_ForLoop.ForLoopTasks;

import java.util.Scanner;

public class Odev05 {

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */
     static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(powerOfThree());
    }

    private static boolean powerOfThree() {
        System.out.println("Bir Sayı Giriniz = ");
        int sayi=sc.nextInt();
        boolean sonuc = false;
        if (sayi%6==0){
            sonuc=false;
        }else {
            for (int i= 3; i<=sayi ; i*=3){
                if (sayi%i!=0) sonuc=false;
                else sonuc=true;}
        }
        return sonuc;
    }
       /* System.out.println("Bir Sayı Giriniz = ");
        int num=sc.nextInt();
        boolean ussuMu=true;
        for (int i = 3; i <=num ; i*=3) {
            if (num%i==0){
                ussuMu=true;
            }

        }
        return ussuMu;
    }

        */
}
