package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {

    public static void main(String[] args) {
        // kullanıcıdan veri almak için şu 3 adım kullanılır
        //1. adım > Scanner class'dan obj create edilir.
        //Scanner scan= new Scanner(System.in); // Scanner classından scan isminde değerini System içerisinden alan bir obj

        //2. adım ->Kullanıcıda istenen veri için bildirimde bulunulur ->sout("....")
      //  System.out.println("adınızı giriniz:");

        //3.adım > kullanıcının girdiği veri data type'ne göre bir variable atanır.
       // String isim=scan.nextLine();// kullanıcıdan gelen string tipinde isim verisi scan objesini nextLine() methodu ile atandı
       // System.out.println("isim = " + isim);
        // TASK > Kullanıcının girdiği değere göre kare alanı ve çevresini hesaplayan bir code create ediniz

     /*   Scanner scan=new Scanner(System.in);
        System.out.println("karenin bir kenarını giriniz");
        int kenar=scan.nextInt();
        System.out.println("alan = " +(kenar*kenar)+"  çevre: "+(kenar*4));

      */

/*
 Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
 Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
 1 seker = 1.7 gr
 Ornek : Input : cay sayisi : 10 seker sayisi :2
         Output : Yilda 12.41 kg seker kullaniyorsunuz

      */

     //System.out.println("günlük içtiğiniz cay sayisini giriniz: ");
     // int caysayisi= sc.nextInt();// çay için 3.adım
     // System.out.println("seker sayısını giriniz"); // şeker için 2. adım
     // int seker=sc.nextInt();
     // System.out.println("Kullanılan seker="+(caysayisi*seker*1.7*365)/1000);


        Scanner sc=new Scanner(System.in);
        System.out.println("isminizi giriniz: ");
        char ch=sc.nextLine().charAt(0); // kullanıcıdan gelen string ifadenin 0.index ilk karakterini alır
        System.out.println("isminizin ilk karakteri = " + ch);












    }
}
