package clarusWay_InterviewQuestionsJava.src.day2;

import java.util.Scanner;

public class Q04_PerfectNumber {  /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();


        girilenSayiyaKadarOlanPerfect(sayi);
    }
    private static void girilenSayiyaKadarOlanPerfect(int sayi) {
        int toplam = 0;
        for (int i = 1; i <= sayi; i++) { //girilen sayiya bakar
          perfectNumber(i);
        }
    }
    private static void perfectNumber(int sayi) {
        int toplam =0;
        for (int i = 1; i <sayi ; i++) { //1 den basalyarak bolenleri kontrol edecegiz, sayi dahil olmamali
            if(sayi%i ==0){ //sayinin herhangi bir boleni (i) varsa
                toplam+=i;//toplam degiskenine ekle
                System.out.print( i + " ");//bolenleri gormek icin
            }
        }
        System.out.println();
        if(toplam ==sayi){ //bolenlerin toplami sayiya esitse
            System.out.println(sayi + " sayisi mukemmel sayidir");
        }else
            System.out.println(sayi + " sayisi mukemmel sayi degildir");
    }
}
