package j08_ifStatement_TernaryOperator.Task_Nestedİf;

import java.util.Scanner;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Müşteri Kartınız Var mı (E/H) olarak Giriniz : ");
        char msk=sc.next().toUpperCase().charAt(0);
      //  if (msk=='E'){
            System.out.print(" Aldiginiz Urunun Adedini Giriniz : ");
            int add=sc.nextInt();
            System.out.print(" Aldiginiz Urunlerin Liste Fiyatini Giriniz : ");
            int fyt=sc.nextInt();
            System.out.println(msk == 'E' ? (add > 10 ? (fyt * 0.8) : (fyt * 0.85)) : ((add > 10) ? (fyt * 0.85) : (fyt * 0.90)));


          /*  if (add>10){
                System.out.println("Tebrikler %20 indirim kazandınız " + "Yeni Fiyatınız : " + (fyt-(fyt*20/100)));
            }else System.out.println("Tebrikler %15 indirim kazandınız " + "Yeni Fiyatınız : " + (fyt-(fyt*15/100)));
        } else if (msk=='H') {
            System.out.print(" Aldiginiz Urunun Adedini Giriniz : ");
            int add=sc.nextInt();
            System.out.print(" Aldiginiz Urunlerin Liste Fiyatini Giriniz : ");
            int fyt=sc.nextInt();
            if (add>10){
                System.out.println("Tebrikler %15 indirim kazandınız " + "Yeni Fiyatınız : " + (fyt-(fyt*15/100)));
            }else System.out.println("Tebrikler %10 indirim kazandınız " + "Yeni Fiyatınız : " + (fyt-(fyt*10/100)));
        }else System.out.println(" Hatali Kodlama Yaptınız ");

           */


    }

}
