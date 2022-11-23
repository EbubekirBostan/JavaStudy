package Day06;

import java.util.Scanner;

public class Q4_ForLoop {
    public static void main(String[] args) {
        /*    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
   ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
   hesaplayan kodu yazın
  Örnek Ekran Çıktısı
  Girilen sayı=4
  Kareler toplamı=14
   */
        Scanner sc=new Scanner(System.in);
        System.out.println("Birden büyük sayı giriniz");
        int num=sc.nextInt();
        int tpl=0;
        System.out.println("girilen sayı: "+num);
        for (int i = num; i >1 ; i--) {
            tpl+=i*i;
        }
        System.out.println("toplam: "+tpl);



    }
}
