package j10_StringManipulations.tasks_StringManipulation;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */
        Scanner sc=new Scanner(System.in);
        System.out.println("Ad soyad giriniz");
        String adSoyad=sc.nextLine();

        String kısaad=adSoyad.toUpperCase().charAt(0)+"."+
                adSoyad.toUpperCase().substring(adSoyad.indexOf(' ')+1,adSoyad.indexOf(' ')+2)+"."+
                adSoyad.toUpperCase().substring(adSoyad.lastIndexOf(' ')+1,adSoyad.lastIndexOf(' ')+2)+".";
        System.out.println("kısaad = " + kısaad);
        System.out.println(adSoyad.toUpperCase().charAt(0)+"."+
                adSoyad.toUpperCase().substring(adSoyad.indexOf(' ')+1,adSoyad.indexOf(' ')+2)+"."+
                adSoyad.toUpperCase().substring(adSoyad.lastIndexOf(' ')+1,adSoyad.lastIndexOf(' ')+2)+".");
    }
}
