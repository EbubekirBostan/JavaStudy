package j12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
        Başlangıç ve bitiş değerleri net(bilind-en değerler) olan tekrarlarda foor loop
        ama adım sayısı belli olmayıp bir şarta bağlı olan tekrarlarda while loop kullanılmalı
         */
        //task>>>> 11 den 20 ye kadar olan tamsayıları code create ediniz...
     /*   System.out.println("***for çözüm***");
        for (int i = 11; i <21 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("*** while çözüm***");
        int basla=11;
        while (basla<21){// başla 21 den küçük iken scopu uygula
            System.out.print(basla+ " ");
            basla++;
        }
        System.out.println();
        //Task 2>>> 7 kere javacan print eden code create ediniz.
        int i=1;
        while (i<8){
            System.out.print(" "+i+".javaCan");
            i++;
        }
        System.out.println();
        //task 03>> 2 basamaklı tek sayıları yan yana print eden code yazınız
        int t=11;
        while (t<100){
            System.out.print(t+ " ");
            t+=2;
        }
        System.out.println();
        // girilen metni tersten yazdıran code create ediniz

       // System.out.println("Bir Metin Giriniz = ");
       // String metin=sc.nextLine();
      //  int metinUzunluk=metin.length();

      /*  while (metinUzunluk>=1){//metnin uzunlugu 1 e eşit ve buyuk iken
            System.out.print(metin.charAt(metinUzunluk-1));//
            metinUzunluk--;
        }
        System.out.println();

       */

        //task05>> Girilen sayıya kadar toplamını print eden code create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir Tamsayı Giriniz = ");
        int num=sc.nextInt();
        int a=0;
        while (num>0){
            a+=num;
            num--;
        }
        System.out.println(a);
        System.out.println("   *** task06 ***   ");

      int faktoriyel = 1;

        while (num > 0) {// sayı 1 olana dek body de ne varsa yap
            faktoriyel *= num;// her döngüde sayıyı toplama ekle
            num--;// her döngüde sayıyı 1 azalt ki dünta döndükçe dönmesin.!!
        }
        System.out.println("agam girdigin sayılar faktoriyeli : " + faktoriyel);







    }
}
