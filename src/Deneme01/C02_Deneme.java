package Deneme01;
  /* Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
        Örnek: (12, 31, 15, 32, 54) ==> Çıktı 31 ve 32'tür
        Listedeki 8 ve 12 dışındaki her öğenin değerini 2'şer artırınız.
        Örnek: (15, 31, 8, 13, 12) ==> Çıktı (17, 33, 8, 15, 12)

        */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_Deneme {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int num= sc.nextInt();
        System.out.println("obebToplam(num) = " + obebToplam(num));
    }

    private static int obebToplam(int num) {
        int obebT=0;
        for (int i = 1; i <=num ; i++) {
            if (num%i==0){
                obebT+=i;
            }
        }
        return obebT;
    }
}



