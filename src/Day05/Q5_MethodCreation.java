package Day05;

import java.util.Scanner;

public class Q5_MethodCreation {
    /*
Kullanicidan bir tam sayi alin.
Bu sayinin negatif veya pozitif oldugunu,
tek mi cift mi oldugunu ve
uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
100'den kucukse sadece birler basamagini yazdirin.
*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Üç basamaklı bir sayı Giriniz");
        int num=scan.nextInt();
        System.out.println("negatifMi = " + negatifMi(num));
        System.out.println("ciftMi = " + Q3_MethodCreation.ciftMi(num));
        ucBasamakli(num);

    }
    private static void ucBasamakli(int num) {
        if (num>99 && num<1000){
            System.out.println(num%10+(num/10)%10+num/100);
        }else if (num<100){
            System.out.println(num%10);
        }else System.out.println("En fazla 3 basamaklı sayı giriniz");
    }

    private static boolean negatifMi(int num) {

        return num<0?true:false;
    }
    /*
   Kullanicidan bir tam sayi alin.
   Bu sayinin negatif veya pozitif oldugunu,
   tek mi cift mi oldugunu ve
   uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
   100'den kucukse sadece birler basamagini yazdirin.
   */
  /*  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz :");
        int sayi= sc.nextInt();
        pozitifNegatif(sayi);
       // System.out.println("sayi cift -> " +Q03_MethodCreation.ciftMi(sayi));
        System.out.println(  sayi >= 100 ? (yuzdenBuyuk(sayi)) : (yuzdenKucuk(sayi)));

    }
    private static int yuzdenKucuk(int sayi) {
        return sayi%10;
    }

    private static int yuzdenBuyuk(int sayi) {
        int birler = sayi%10, onlar =(sayi/10) %10, yuzler = sayi/100;
        int toplam =0;
        toplam = birler + onlar+ yuzler;
        return toplam;
    }
    private static void pozitifNegatif(int sayi) {
        System.out.println(sayi >0 && sayi!=0 ? "pozitif":"negatif");
    }*/
}
