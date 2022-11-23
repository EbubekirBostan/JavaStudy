package J04_AritmeticOperators.aritmeticodev;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("İnek ve koyunların toplam sayısını giriniz");
        int ik=sc.nextInt();
        System.out.println("Tavuk sayısını giriniz");
        int tvk=sc.nextInt();
        System.out.println("Toplam ayak sayısı = "+ ((ik*4)+(tvk*2)));



    }

}
